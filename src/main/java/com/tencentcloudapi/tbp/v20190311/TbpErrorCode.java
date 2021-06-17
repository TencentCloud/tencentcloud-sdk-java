package com.tencentcloudapi.tbp.v20190311;
public enum TbpErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 调用元数据服务失败。
     INTERNALERROR_CALLMMSFAILED("InternalError.CallMMSFailed"),
     
    // 请求ASR服务失败。
     INTERNALERROR_ERRORASR("InternalError.ErrorAsr"),
     
    // 查询数据库失败，没有对应数据。
     INTERNALERROR_ERRORMMS("InternalError.ErrorMms"),
     
    // nlu处理失败。
     INTERNALERROR_ERRORNLU("InternalError.ErrorNlu"),
     
    // rpc调用失败。
     INTERNALERROR_ERRORRPC("InternalError.ErrorRpc"),
     
    // 请求TTS服务失败。
     INTERNALERROR_ERRORTTS("InternalError.ErrorTts"),
     
    // webHook处理失败。
     INTERNALERROR_ERRORWEBHOOK("InternalError.ErrorWebHook"),
     
    // 查询元数据失败，没有对应数据。
     INTERNALERROR_MMSINTERNALERROR("InternalError.MMSInternalError"),
     
    // 未开通相关应用访问权限。
     INTERNALERROR_NOAPPPRIVILEGE("InternalError.NoAppPrivilege"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter");
     
    private String value;
    private TbpErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

