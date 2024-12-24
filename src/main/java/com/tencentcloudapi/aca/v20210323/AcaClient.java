/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.aca.v20210323;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.aca.v20210323.models.*;

public class AcaClient extends AbstractClient{
    private static String endpoint = "aca.tencentcloudapi.com";
    private static String service = "aca";
    private static String version = "2021-03-23";
    
    public AcaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AcaClient(Credential credential, String region, ClientProfile profile) {
        super(AcaClient.endpoint, AcaClient.version, credential, region, profile);
    }

    /**
     *药品适应症接口
     * @param req GetDrugIndicationsRequest
     * @return GetDrugIndicationsResponse
     * @throws TencentCloudSDKException
     */
    public GetDrugIndicationsResponse GetDrugIndications(GetDrugIndicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDrugIndications", GetDrugIndicationsResponse.class);
    }

    /**
     *登录获取token
     * @param req LoginHisToolRequest
     * @return LoginHisToolResponse
     * @throws TencentCloudSDKException
     */
    public LoginHisToolResponse LoginHisTool(LoginHisToolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LoginHisTool", LoginHisToolResponse.class);
    }

    /**
     *登出
     * @param req LoginOutHisToolRequest
     * @return LoginOutHisToolResponse
     * @throws TencentCloudSDKException
     */
    public LoginOutHisToolResponse LoginOutHisTool(LoginOutHisToolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LoginOutHisTool", LoginOutHisToolResponse.class);
    }

    /**
     *智能用药接口
     * @param req SmartDrugInfoRequest
     * @return SmartDrugInfoResponse
     * @throws TencentCloudSDKException
     */
    public SmartDrugInfoResponse SmartDrugInfo(SmartDrugInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SmartDrugInfo", SmartDrugInfoResponse.class);
    }

    /**
     *辅诊智能预测接口
     * @param req SmartPredictRequest
     * @return SmartPredictResponse
     * @throws TencentCloudSDKException
     */
    public SmartPredictResponse SmartPredict(SmartPredictRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SmartPredict", SmartPredictResponse.class);
    }

    /**
     *用于院方科室管理，获取科室列表和状态、新增或修改科室信息、删除科室。
     * @param req SyncDepartmentRequest
     * @return SyncDepartmentResponse
     * @throws TencentCloudSDKException
     */
    public SyncDepartmentResponse SyncDepartment(SyncDepartmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncDepartment", SyncDepartmentResponse.class);
    }

    /**
     *同步标准字典，如给药频次、给药途径、科室、诊断等
     * @param req SyncStandardDictRequest
     * @return SyncStandardDictResponse
     * @throws TencentCloudSDKException
     */
    public SyncStandardDictResponse SyncStandardDict(SyncStandardDictRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncStandardDict", SyncStandardDictResponse.class);
    }

    /**
     *药品同步，一次同步数据不要超过500个
     * @param req UploadDrugsRequest
     * @return UploadDrugsResponse
     * @throws TencentCloudSDKException
     */
    public UploadDrugsResponse UploadDrugs(UploadDrugsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadDrugs", UploadDrugsResponse.class);
    }

}
