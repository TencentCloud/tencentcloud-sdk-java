package com.tencentcloudapi.unit.hunyuanclient;

import com.tencentcloudapi.hunyuan.v20230901.HunyuanErrorCode;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.assertEquals;

public class HunyuanErrorCodeTest {
    @Test
    public void testErrorCode() throws Exception {
        assertEquals("FailedOperation", HunyuanErrorCode.FAILEDOPERATION.getValue());
        assertEquals("FailedOperation.EngineRequestTimeout", HunyuanErrorCode.FAILEDOPERATION_ENGINEREQUESTTIMEOUT.getValue());
        assertEquals("FailedOperation.EngineServerError", HunyuanErrorCode.FAILEDOPERATION_ENGINESERVERERROR.getValue());
        assertEquals("FailedOperation.EngineServerLimitExceeded",HunyuanErrorCode.FAILEDOPERATION_ENGINESERVERLIMITEXCEEDED.getValue());
        assertEquals("FailedOperation.FreeResourcePackExhausted", HunyuanErrorCode.FAILEDOPERATION_FREERESOURCEPACKEXHAUSTED.getValue());
        assertEquals("FailedOperation.ImageDecodeFailed", HunyuanErrorCode.FAILEDOPERATION_IMAGEDECODEFAILED.getValue());
        assertEquals("FailedOperation.ImageDownloadError", HunyuanErrorCode.FAILEDOPERATION_IMAGEDOWNLOADERROR.getValue());
        assertEquals("FailedOperation.ResourcePackExhausted", HunyuanErrorCode.FAILEDOPERATION_RESOURCEPACKEXHAUSTED.getValue());
        assertEquals("FailedOperation.ServiceNotActivated", HunyuanErrorCode.FAILEDOPERATION_SERVICENOTACTIVATED.getValue());
        assertEquals("FailedOperation.ServiceStop", HunyuanErrorCode.FAILEDOPERATION_SERVICESTOP.getValue());
        assertEquals("FailedOperation.ServiceStopArrears", HunyuanErrorCode.FAILEDOPERATION_SERVICESTOPARREARS.getValue());
        assertEquals("InternalError", HunyuanErrorCode.INTERNALERROR.getValue());
        assertEquals("InvalidParameter", HunyuanErrorCode.INVALIDPARAMETER.getValue());
        assertEquals("InvalidParameterValue", HunyuanErrorCode.INVALIDPARAMETERVALUE.getValue());
        assertEquals("InvalidParameterValue.Model", HunyuanErrorCode.INVALIDPARAMETERVALUE_MODEL.getValue());
        assertEquals("InvalidParameterValue.ParameterValueError", HunyuanErrorCode.INVALIDPARAMETERVALUE_PARAMETERVALUEERROR.getValue());
        assertEquals("LimitExceeded", HunyuanErrorCode.LIMITEXCEEDED.getValue());
        assertEquals("OperationDenied.ImageIllegalDetected", HunyuanErrorCode.OPERATIONDENIED_IMAGEILLEGALDETECTED.getValue());
    }
}
