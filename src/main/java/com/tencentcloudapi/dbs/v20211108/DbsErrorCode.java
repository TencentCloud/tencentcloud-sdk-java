package com.tencentcloudapi.dbs.v20211108;
public enum DbsErrorCode {
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 数据库访问错误。 */
     INTERNALERROR_DATABASEACCESSERROR("InternalError.DatabaseAccessError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* 操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private DbsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

