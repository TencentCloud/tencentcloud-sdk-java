package com.tencentcloudapi.tbm.v20180129;
public enum TbmErrorCode {
    // 数据处理中。
     INTERNALERROR_DATAINPROCESSING("InternalError.DataInProcessing"),
     
    // 内部接口错误。
     INTERNALERROR_INNERSERVERFAILED("InternalError.InnerServerFailed"),
     
    // 元数据操作失败。
     INTERNALERROR_METADATAOPFAILED("InternalError.MetaDataOpFailed"),
     
    // 参数错误
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 缺少参数错误
     MISSINGPARAMETER("MissingParameter"),
     
    // 资源不存在
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 未授权操作
     UNAUTHORIZEDOPERATION("UnauthorizedOperation");
     
    private String value;
    private TbmErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

