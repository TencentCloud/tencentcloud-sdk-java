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
     *删除云托管服务：包括服务下的版本，镜像，流水线
     * @param req DeleteCloudRunServerRequest
     * @return DeleteCloudRunServerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudRunServerResponse DeleteCloudRunServer(DeleteCloudRunServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudRunServer", DeleteCloudRunServerResponse.class);
    }

    /**
     *批量删除版本
     * @param req DeleteCloudRunVersionsRequest
     * @return DeleteCloudRunVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudRunVersionsResponse DeleteCloudRunVersions(DeleteCloudRunVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudRunVersions", DeleteCloudRunVersionsResponse.class);
    }

    /**
     *查询云托管部署记录
     * @param req DescribeCloudRunDeployRecordRequest
     * @return DescribeCloudRunDeployRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudRunDeployRecordResponse DescribeCloudRunDeployRecord(DescribeCloudRunDeployRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudRunDeployRecord", DescribeCloudRunDeployRecordResponse.class);
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
     *查询云托管Pod实例列表
     * @param req DescribeCloudRunPodListRequest
     * @return DescribeCloudRunPodListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudRunPodListResponse DescribeCloudRunPodList(DescribeCloudRunPodListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudRunPodList", DescribeCloudRunPodListResponse.class);
    }

    /**
     *查询运行日志
     * @param req DescribeCloudRunProcessLogRequest
     * @return DescribeCloudRunProcessLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudRunProcessLogResponse DescribeCloudRunProcessLog(DescribeCloudRunProcessLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudRunProcessLog", DescribeCloudRunProcessLogResponse.class);
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
     *查询发布单
     * @param req DescribeReleaseOrderRequest
     * @return DescribeReleaseOrderResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleaseOrderResponse DescribeReleaseOrder(DescribeReleaseOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReleaseOrder", DescribeReleaseOrderResponse.class);
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
     *查询版本详情
     * @param req DescribeVersionDetailRequest
     * @return DescribeVersionDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVersionDetailResponse DescribeVersionDetail(DescribeVersionDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVersionDetail", DescribeVersionDetailResponse.class);
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
     *查询日志信息
     * @param req SearchClsLogRequest
     * @return SearchClsLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchClsLogResponse SearchClsLog(SearchClsLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchClsLog", SearchClsLogResponse.class);
    }

    /**
     *回滚版本
     * @param req SubmitServerRollbackRequest
     * @return SubmitServerRollbackResponse
     * @throws TencentCloudSDKException
     */
    public SubmitServerRollbackResponse SubmitServerRollback(SubmitServerRollbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitServerRollback", SubmitServerRollbackResponse.class);
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
