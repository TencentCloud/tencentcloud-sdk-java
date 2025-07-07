/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.bizlive.v20190313;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bizlive.v20190313.models.*;

public class BizliveClient extends AbstractClient{
    private static String endpoint = "bizlive.tencentcloudapi.com";
    private static String service = "bizlive";
    private static String version = "2019-03-13";

    public BizliveClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BizliveClient(Credential credential, String region, ClientProfile profile) {
        super(BizliveClient.endpoint, BizliveClient.version, credential, region, profile);
    }

    /**
     *创建会话
     * @param req CreateSessionRequest
     * @return CreateSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateSessionResponse CreateSession(CreateSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSession", CreateSessionResponse.class);
    }

    /**
     *查询播放数据，支持按流名称查询详细播放数据，也可按播放域名查询详细总数据。
     * @param req DescribeStreamPlayInfoListRequest
     * @return DescribeStreamPlayInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPlayInfoListResponse DescribeStreamPlayInfoList(DescribeStreamPlayInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPlayInfoList", DescribeStreamPlayInfoListResponse.class);
    }

    /**
     *查询空闲机器数量
     * @param req DescribeWorkersRequest
     * @return DescribeWorkersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkersResponse DescribeWorkers(DescribeWorkersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkers", DescribeWorkersResponse.class);
    }

    /**
     *禁止某条流的推送，可以预设某个时刻将流恢复。
     * @param req ForbidLiveStreamRequest
     * @return ForbidLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ForbidLiveStreamResponse ForbidLiveStream(ForbidLiveStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ForbidLiveStream", ForbidLiveStreamResponse.class);
    }

    /**
     *注册聊天室
     * @param req RegisterIMRequest
     * @return RegisterIMResponse
     * @throws TencentCloudSDKException
     */
    public RegisterIMResponse RegisterIM(RegisterIMRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterIM", RegisterIMResponse.class);
    }

    /**
     *强制退出游戏
     * @param req StopGameRequest
     * @return StopGameResponse
     * @throws TencentCloudSDKException
     */
    public StopGameResponse StopGame(StopGameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopGame", StopGameResponse.class);
    }

}
