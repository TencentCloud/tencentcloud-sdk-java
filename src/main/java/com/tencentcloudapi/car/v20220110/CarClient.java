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
package com.tencentcloudapi.car.v20220110;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.car.v20220110.models.*;

public class CarClient extends AbstractClient{
    private static String endpoint = "car.tencentcloudapi.com";
    private static String service = "car";
    private static String version = "2022-01-10";
    
    public CarClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CarClient(Credential credential, String region, ClientProfile profile) {
        super(CarClient.endpoint, CarClient.version, credential, region, profile);
    }

    /**
     *本接口用于申请并发。接口超时时间：20秒。
     * @param req ApplyConcurrentRequest
     * @return ApplyConcurrentResponse
     * @throws TencentCloudSDKException
     */
    public ApplyConcurrentResponse ApplyConcurrent(ApplyConcurrentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyConcurrent", ApplyConcurrentResponse.class);
    }

    /**
     *本接口用于创建会话。接口超时时间：5秒。
     * @param req CreateSessionRequest
     * @return CreateSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateSessionResponse CreateSession(CreateSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSession", CreateSessionResponse.class);
    }

    /**
     *销毁会话。如果该会话开启了云端推流，那么销毁会话时会结束云端推流。
     * @param req DestroySessionRequest
     * @return DestroySessionResponse
     * @throws TencentCloudSDKException
     */
    public DestroySessionResponse DestroySession(DestroySessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroySession", DestroySessionResponse.class);
    }

    /**
     *开始云端推流。云端推流 codec 根据客户端（SDK）能力来自动选择，默认优先顺序为 H265、H264、VP8、VP9。
     * @param req StartPublishStreamRequest
     * @return StartPublishStreamResponse
     * @throws TencentCloudSDKException
     */
    public StartPublishStreamResponse StartPublishStream(StartPublishStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartPublishStream", StartPublishStreamResponse.class);
    }

    /**
     *开始云端推流到指定URL。云端推流 codec 根据客户端（SDK）能力来自动选择，默认优先顺序为 H265、H264、VP8、VP9。该推流方式需要单独计费，详细计费方式请查看[指定地址推流费用说明](https://cloud.tencent.com/document/product/1547/72168#98ac188a-d122-4caf-88be-05268ecefdf6)
     * @param req StartPublishStreamWithURLRequest
     * @return StartPublishStreamWithURLResponse
     * @throws TencentCloudSDKException
     */
    public StartPublishStreamWithURLResponse StartPublishStreamWithURL(StartPublishStreamWithURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartPublishStreamWithURL", StartPublishStreamWithURLResponse.class);
    }

    /**
     *停止云端推流
     * @param req StopPublishStreamRequest
     * @return StopPublishStreamResponse
     * @throws TencentCloudSDKException
     */
    public StopPublishStreamResponse StopPublishStream(StopPublishStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopPublishStream", StopPublishStreamResponse.class);
    }

}
