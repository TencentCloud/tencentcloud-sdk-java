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
package com.tencentcloudapi.tcbr.v20220217;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcbr.v20220217.models.*;

public class TcbrClient extends AbstractClient{
    private static String endpoint = "tcbr.tencentcloudapi.com";
    private static String service = "tcbr";
    private static String version = "2022-02-17";
    
    public TcbrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcbrClient(Credential credential, String region, ClientProfile profile) {
        super(TcbrClient.endpoint, TcbrClient.version, credential, region, profile);
    }

    /**
     *创建云托管环境，并开通资源。
     * @param req CreateCloudRunEnvRequest
     * @return CreateCloudRunEnvResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudRunEnvResponse CreateCloudRunEnv(CreateCloudRunEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudRunEnv", CreateCloudRunEnvResponse.class);
    }

    /**
     *创建云托管服务接口
     * @param req CreateCloudRunServerRequest
     * @return CreateCloudRunServerResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudRunServerResponse CreateCloudRunServer(CreateCloudRunServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudRunServer", CreateCloudRunServerResponse.class);
    }

    /**
     *获取环境列表，含环境下的各个资源信息。尤其是各资源的唯一标识，是请求各资源的关键参数
     * @param req DescribeCloudRunEnvsRequest
     * @return DescribeCloudRunEnvsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudRunEnvsResponse DescribeCloudRunEnvs(DescribeCloudRunEnvsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudRunEnvs", DescribeCloudRunEnvsResponse.class);
    }

    /**
     *查询云托管服务详情
     * @param req DescribeCloudRunServerDetailRequest
     * @return DescribeCloudRunServerDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudRunServerDetailResponse DescribeCloudRunServerDetail(DescribeCloudRunServerDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudRunServerDetail", DescribeCloudRunServerDetailResponse.class);
    }

    /**
     *查询云托管服务列表接口
     * @param req DescribeCloudRunServersRequest
     * @return DescribeCloudRunServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudRunServersResponse DescribeCloudRunServers(DescribeCloudRunServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudRunServers", DescribeCloudRunServersResponse.class);
    }

    /**
     *查询环境基础信息
     * @param req DescribeEnvBaseInfoRequest
     * @return DescribeEnvBaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvBaseInfoResponse DescribeEnvBaseInfo(DescribeEnvBaseInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvBaseInfo", DescribeEnvBaseInfoResponse.class);
    }

    /**
     *查询服务管理任务信息
     * @param req DescribeServerManageTaskRequest
     * @return DescribeServerManageTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServerManageTaskResponse DescribeServerManageTask(DescribeServerManageTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServerManageTask", DescribeServerManageTaskResponse.class);
    }

    /**
     *操作发布单
     * @param req OperateServerManageRequest
     * @return OperateServerManageResponse
     * @throws TencentCloudSDKException
     */
    public OperateServerManageResponse OperateServerManage(OperateServerManageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OperateServerManage", OperateServerManageResponse.class);
    }

    /**
     *灰度发布
     * @param req ReleaseGrayRequest
     * @return ReleaseGrayResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseGrayResponse ReleaseGray(ReleaseGrayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseGray", ReleaseGrayResponse.class);
    }

    /**
     *更新云托管服务
     * @param req UpdateCloudRunServerRequest
     * @return UpdateCloudRunServerResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCloudRunServerResponse UpdateCloudRunServer(UpdateCloudRunServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCloudRunServer", UpdateCloudRunServerResponse.class);
    }

}
