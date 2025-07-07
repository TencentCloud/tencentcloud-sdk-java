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
package com.tencentcloudapi.omics.v20221128;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.omics.v20221128.models.*;

public class OmicsClient extends AbstractClient{
    private static String endpoint = "omics.tencentcloudapi.com";
    private static String service = "omics";
    private static String version = "2022-11-28";

    public OmicsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public OmicsClient(Credential credential, String region, ClientProfile profile) {
        super(OmicsClient.endpoint, OmicsClient.version, credential, region, profile);
    }

    /**
     *创建组学平台计算环境。
     * @param req CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnvironmentResponse CreateEnvironment(CreateEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEnvironment", CreateEnvironmentResponse.class);
    }

    /**
     *创建缓存卷。
     * @param req CreateVolumeRequest
     * @return CreateVolumeResponse
     * @throws TencentCloudSDKException
     */
    public CreateVolumeResponse CreateVolume(CreateVolumeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVolume", CreateVolumeResponse.class);
    }

    /**
     *删除环境。
     * @param req DeleteEnvironmentRequest
     * @return DeleteEnvironmentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEnvironmentResponse DeleteEnvironment(DeleteEnvironmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEnvironment", DeleteEnvironmentResponse.class);
    }

    /**
     *删除缓存卷。
     * @param req DeleteVolumeRequest
     * @return DeleteVolumeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVolumeResponse DeleteVolume(DeleteVolumeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVolume", DeleteVolumeResponse.class);
    }

    /**
     *删除缓存卷数据。
     * @param req DeleteVolumeDataRequest
     * @return DeleteVolumeDataResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVolumeDataResponse DeleteVolumeData(DeleteVolumeDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVolumeData", DeleteVolumeDataResponse.class);
    }

    /**
     *查询环境列表。
     * @param req DescribeEnvironmentsRequest
     * @return DescribeEnvironmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvironmentsResponse DescribeEnvironments(DescribeEnvironmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvironments", DescribeEnvironmentsResponse.class);
    }

    /**
     *查询任务批次列表。
     * @param req DescribeRunGroupsRequest
     * @return DescribeRunGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRunGroupsResponse DescribeRunGroups(DescribeRunGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRunGroups", DescribeRunGroupsResponse.class);
    }

    /**
     *查询任务列表。
     * @param req DescribeRunsRequest
     * @return DescribeRunsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRunsResponse DescribeRuns(DescribeRunsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuns", DescribeRunsResponse.class);
    }

    /**
     *查询表格。
     * @param req DescribeTablesRequest
     * @return DescribeTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesResponse DescribeTables(DescribeTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTables", DescribeTablesResponse.class);
    }

    /**
     *查询表格行数据。
     * @param req DescribeTablesRowsRequest
     * @return DescribeTablesRowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesRowsResponse DescribeTablesRows(DescribeTablesRowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTablesRows", DescribeTablesRowsResponse.class);
    }

    /**
     *查询缓存卷列表。
     * @param req DescribeVolumesRequest
     * @return DescribeVolumesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVolumesResponse DescribeVolumes(DescribeVolumesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVolumes", DescribeVolumesResponse.class);
    }

    /**
     *查询作业详情。
     * @param req GetRunCallsRequest
     * @return GetRunCallsResponse
     * @throws TencentCloudSDKException
     */
    public GetRunCallsResponse GetRunCalls(GetRunCallsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRunCalls", GetRunCallsResponse.class);
    }

    /**
     *获取任务详情文件。
     * @param req GetRunMetadataFileRequest
     * @return GetRunMetadataFileResponse
     * @throws TencentCloudSDKException
     */
    public GetRunMetadataFileResponse GetRunMetadataFile(GetRunMetadataFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRunMetadataFile", GetRunMetadataFileResponse.class);
    }

    /**
     *查询任务详情。
     * @param req GetRunStatusRequest
     * @return GetRunStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetRunStatusResponse GetRunStatus(GetRunStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRunStatus", GetRunStatusResponse.class);
    }

    /**
     *导入表格文件。
     * @param req ImportTableFileRequest
     * @return ImportTableFileResponse
     * @throws TencentCloudSDKException
     */
    public ImportTableFileResponse ImportTableFile(ImportTableFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportTableFile", ImportTableFileResponse.class);
    }

    /**
     *修改缓存卷。
     * @param req ModifyVolumeRequest
     * @return ModifyVolumeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVolumeResponse ModifyVolume(ModifyVolumeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVolume", ModifyVolumeResponse.class);
    }

    /**
     *重试任务。
     * @param req RetryRunsRequest
     * @return RetryRunsResponse
     * @throws TencentCloudSDKException
     */
    public RetryRunsResponse RetryRuns(RetryRunsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryRuns", RetryRunsResponse.class);
    }

    /**
     *运行应用。
     * @param req RunApplicationRequest
     * @return RunApplicationResponse
     * @throws TencentCloudSDKException
     */
    public RunApplicationResponse RunApplication(RunApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunApplication", RunApplicationResponse.class);
    }

    /**
     *运行工作流。
     * @param req RunWorkflowRequest
     * @return RunWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public RunWorkflowResponse RunWorkflow(RunWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunWorkflow", RunWorkflowResponse.class);
    }

    /**
     *终止任务批次。
     * @param req TerminateRunGroupRequest
     * @return TerminateRunGroupResponse
     * @throws TencentCloudSDKException
     */
    public TerminateRunGroupResponse TerminateRunGroup(TerminateRunGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateRunGroup", TerminateRunGroupResponse.class);
    }

}
