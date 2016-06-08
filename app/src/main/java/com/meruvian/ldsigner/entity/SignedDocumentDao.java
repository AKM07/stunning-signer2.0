package com.meruvian.ldsigner.entity;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;

import com.meruvian.ldsigner.entity.SignedDocument;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SIGNED_DOCUMENT".
*/
public class SignedDocumentDao extends AbstractDao<SignedDocument, Long> {

    public static final String TABLENAME = "SIGNED_DOCUMENT";

    /**
     * Properties of entity SignedDocument.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property DbId = new Property(0, Long.class, "dbId", true, "_id");
        public final static Property DbCreateDate = new Property(1, java.util.Date.class, "dbCreateDate", false, "CREATE_DATE");
        public final static Property DbUpdateDate = new Property(2, java.util.Date.class, "dbUpdateDate", false, "UPDATE_DATE");
        public final static Property DbCreateBy = new Property(3, String.class, "dbCreateBy", false, "CREATE_BY");
        public final static Property DbUpdateBy = new Property(4, String.class, "dbUpdateBy", false, "UPDATE_BY");
        public final static Property DbActiveFlag = new Property(5, Integer.class, "dbActiveFlag", false, "ACTIVE_FLAG");
        public final static Property Id = new Property(6, String.class, "id", false, "REF_ID");
        public final static Property RefCreateDate = new Property(7, java.util.Date.class, "refCreateDate", false, "REF_CREATE_DATE");
        public final static Property RefCreateBy = new Property(8, String.class, "refCreateBy", false, "REF_CREATE_BY");
        public final static Property DocumentId = new Property(9, Long.class, "documentId", false, "DOCUMENT_ID");
        public final static Property ParentDocument = new Property(10, Long.class, "parentDocument", false, "PARENT_DOCUMENT");
        public final static Property SignatureBlob = new Property(11, byte[].class, "signatureBlob", false, "SIGNATURE_BLOB");
        public final static Property SignedDocumentBlob = new Property(12, byte[].class, "signedDocumentBlob", false, "SIGNED_DOCUMENT_BLOB");
        public final static Property SignatureProperties = new Property(13, String.class, "signatureProperties", false, "SIGNATURE_PROPERTIES");
        public final static Property SignatureType = new Property(14, String.class, "signatureType", false, "SIGNATURE_TYPE");
    };

    private DaoSession daoSession;


    public SignedDocumentDao(DaoConfig config) {
        super(config);
    }
    
    public SignedDocumentDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SIGNED_DOCUMENT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: dbId
                "\"CREATE_DATE\" INTEGER," + // 1: dbCreateDate
                "\"UPDATE_DATE\" INTEGER," + // 2: dbUpdateDate
                "\"CREATE_BY\" TEXT," + // 3: dbCreateBy
                "\"UPDATE_BY\" TEXT," + // 4: dbUpdateBy
                "\"ACTIVE_FLAG\" INTEGER," + // 5: dbActiveFlag
                "\"REF_ID\" TEXT," + // 6: id
                "\"REF_CREATE_DATE\" INTEGER," + // 7: refCreateDate
                "\"REF_CREATE_BY\" TEXT," + // 8: refCreateBy
                "\"DOCUMENT_ID\" INTEGER," + // 9: documentId
                "\"PARENT_DOCUMENT\" INTEGER," + // 10: parentDocument
                "\"SIGNATURE_BLOB\" BLOB," + // 11: signatureBlob
                "\"SIGNED_DOCUMENT_BLOB\" BLOB," + // 12: signedDocumentBlob
                "\"SIGNATURE_PROPERTIES\" TEXT," + // 13: signatureProperties
                "\"SIGNATURE_TYPE\" TEXT);"); // 14: signatureType
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SIGNED_DOCUMENT\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, SignedDocument entity) {
        stmt.clearBindings();
 
        Long dbId = entity.getDbId();
        if (dbId != null) {
            stmt.bindLong(1, dbId);
        }
 
        java.util.Date dbCreateDate = entity.getDbCreateDate();
        if (dbCreateDate != null) {
            stmt.bindLong(2, dbCreateDate.getTime());
        }
 
        java.util.Date dbUpdateDate = entity.getDbUpdateDate();
        if (dbUpdateDate != null) {
            stmt.bindLong(3, dbUpdateDate.getTime());
        }
 
        String dbCreateBy = entity.getDbCreateBy();
        if (dbCreateBy != null) {
            stmt.bindString(4, dbCreateBy);
        }
 
        String dbUpdateBy = entity.getDbUpdateBy();
        if (dbUpdateBy != null) {
            stmt.bindString(5, dbUpdateBy);
        }
 
        Integer dbActiveFlag = entity.getDbActiveFlag();
        if (dbActiveFlag != null) {
            stmt.bindLong(6, dbActiveFlag);
        }
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(7, id);
        }
 
        java.util.Date refCreateDate = entity.getRefCreateDate();
        if (refCreateDate != null) {
            stmt.bindLong(8, refCreateDate.getTime());
        }
 
        String refCreateBy = entity.getRefCreateBy();
        if (refCreateBy != null) {
            stmt.bindString(9, refCreateBy);
        }
 
        Long documentId = entity.getDocumentId();
        if (documentId != null) {
            stmt.bindLong(10, documentId);
        }
 
        Long parentDocument = entity.getParentDocument();
        if (parentDocument != null) {
            stmt.bindLong(11, parentDocument);
        }
 
        byte[] signatureBlob = entity.getSignatureBlob();
        if (signatureBlob != null) {
            stmt.bindBlob(12, signatureBlob);
        }
 
        byte[] signedDocumentBlob = entity.getSignedDocumentBlob();
        if (signedDocumentBlob != null) {
            stmt.bindBlob(13, signedDocumentBlob);
        }
 
        String signatureProperties = entity.getSignatureProperties();
        if (signatureProperties != null) {
            stmt.bindString(14, signatureProperties);
        }
 
        String signatureType = entity.getSignatureType();
        if (signatureType != null) {
            stmt.bindString(15, signatureType);
        }
    }

    @Override
    protected void attachEntity(SignedDocument entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public SignedDocument readEntity(Cursor cursor, int offset) {
        SignedDocument entity = new SignedDocument( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // dbId
            cursor.isNull(offset + 1) ? null : new java.util.Date(cursor.getLong(offset + 1)), // dbCreateDate
            cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)), // dbUpdateDate
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // dbCreateBy
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // dbUpdateBy
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // dbActiveFlag
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // id
            cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)), // refCreateDate
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // refCreateBy
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9), // documentId
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10), // parentDocument
            cursor.isNull(offset + 11) ? null : cursor.getBlob(offset + 11), // signatureBlob
            cursor.isNull(offset + 12) ? null : cursor.getBlob(offset + 12), // signedDocumentBlob
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // signatureProperties
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14) // signatureType
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, SignedDocument entity, int offset) {
        entity.setDbId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDbCreateDate(cursor.isNull(offset + 1) ? null : new java.util.Date(cursor.getLong(offset + 1)));
        entity.setDbUpdateDate(cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)));
        entity.setDbCreateBy(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDbUpdateBy(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDbActiveFlag(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setId(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setRefCreateDate(cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)));
        entity.setRefCreateBy(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setDocumentId(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
        entity.setParentDocument(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
        entity.setSignatureBlob(cursor.isNull(offset + 11) ? null : cursor.getBlob(offset + 11));
        entity.setSignedDocumentBlob(cursor.isNull(offset + 12) ? null : cursor.getBlob(offset + 12));
        entity.setSignatureProperties(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setSignatureType(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(SignedDocument entity, long rowId) {
        entity.setDbId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(SignedDocument entity) {
        if(entity != null) {
            return entity.getDbId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getDocumentDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getSignedDocumentDao().getAllColumns());
            builder.append(" FROM SIGNED_DOCUMENT T");
            builder.append(" LEFT JOIN DOCUMENT T0 ON T.\"DOCUMENT_ID\"=T0.\"_id\"");
            builder.append(" LEFT JOIN SIGNED_DOCUMENT T1 ON T.\"PARENT_DOCUMENT\"=T1.\"_id\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected SignedDocument loadCurrentDeep(Cursor cursor, boolean lock) {
        SignedDocument entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Document document = loadCurrentOther(daoSession.getDocumentDao(), cursor, offset);
        entity.setDocument(document);
        offset += daoSession.getDocumentDao().getAllColumns().length;

        SignedDocument signedDocument = loadCurrentOther(daoSession.getSignedDocumentDao(), cursor, offset);
        entity.setSignedDocument(signedDocument);

        return entity;    
    }

    public SignedDocument loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<SignedDocument> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<SignedDocument> list = new ArrayList<SignedDocument>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<SignedDocument> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<SignedDocument> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}