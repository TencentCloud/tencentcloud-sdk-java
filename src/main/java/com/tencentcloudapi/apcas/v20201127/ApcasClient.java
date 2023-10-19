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
package com.tencentcloudapi.apcas.v20201127;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.apcas.v20201127.models.*;

public class ApcasClient extends AbstractClient{
    private static String endpoint = "apcas.tencentcloudapi.com";
    private static String service = "apcas";
    private static String version = "2020-11-27";
    
    public ApcasClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ApcasClient(Credential credential, String region, ClientProfile profile) {
        super(ApcasClient.endpoint, ApcasClient.version, credential, region, profile);
    }

    /**
     *查询画像洞察任务详情
     * @param req GetTaskDetailRequest
     * @return GetTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskDetailResponse GetTaskDetail(GetTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskDetail", GetTaskDetailResponse.class);
    }

    /**
     *查询当前账号AppID下的画像洞察任务列表
     * @param req GetTaskListRequest
     * @return GetTaskListResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskListResponse GetTaskList(GetTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTaskList", GetTaskListResponse.class);
    }

    /**
     *根据传入的设备号（IMEI、IDFA、手机号、手机号MD5），返回意向评级结果
     * @param req PredictRatingRequest
     * @return PredictRatingResponse
     * @throws TencentCloudSDKException
     */
    public PredictRatingResponse PredictRating(PredictRatingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PredictRating", PredictRatingResponse.class);
    }

    /**
     *查询调用明细
     * @param req QueryCallDetailsRequest
     * @return QueryCallDetailsResponse
     * @throws TencentCloudSDKException
     */
    public QueryCallDetailsResponse QueryCallDetails(QueryCallDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryCallDetails", QueryCallDetailsResponse.class);
    }

    /**
     *按时间维度获取调用量统计
     * @param req QueryCallStatRequest
     * @return QueryCallStatResponse
     * @throws TencentCloudSDKException
     */
    public QueryCallStatResponse QueryCallStat(QueryCallStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryCallStat", QueryCallStatResponse.class);
    }

    /**
     *获取日/月/周/总调用量统计数据
     * @param req QueryGeneralStatRequest
     * @return QueryGeneralStatResponse
     * @throws TencentCloudSDKException
     */
    public QueryGeneralStatResponse QueryGeneralStat(QueryGeneralStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryGeneralStat", QueryGeneralStatResponse.class);
    }

    /**
     *上传群体画像的ID列表（支持的ID类型：0:imei 7:IDFA 8:MD5(imei)），后台返回生成的画像分析任务ID
     * @param req UploadIdRequest
     * @return UploadIdResponse
     * @throws TencentCloudSDKException
     */
    public UploadIdResponse UploadId(UploadIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadId", UploadIdResponse.class);
    }

}
