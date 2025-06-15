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
package com.tencentcloudapi.ioa.v20220601;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ioa.v20220601.models.*;

public class IoaClient extends AbstractClient{
    private static String endpoint = "ioa.tencentcloudapi.com";
    private static String service = "ioa";
    private static String version = "2022-06-01";
    
    public IoaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IoaClient(Credential credential, String region, ClientProfile profile) {
        super(IoaClient.endpoint, IoaClient.version, credential, region, profile);
    }

    /**
     *提交送检任务
     * @param req CreateDLPFileDetectionTaskRequest
     * @return CreateDLPFileDetectionTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDLPFileDetectionTaskResponse CreateDLPFileDetectionTask(CreateDLPFileDetectionTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDLPFileDetectionTask", CreateDLPFileDetectionTaskResponse.class);
    }

    /**
     *创建获取终端进程网络服务信息任务，私有化调用path为：capi/Assets/Device/DescribeDeviceInfo
     * @param req CreateDeviceTaskRequest
     * @return CreateDeviceTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceTaskResponse CreateDeviceTask(CreateDeviceTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDeviceTask", CreateDeviceTaskResponse.class);
    }

    /**
     *创建终端自定义分组，私有化调用path为：/capi/Assets/Device/CreateDeviceVirtualGroup
     * @param req CreateDeviceVirtualGroupRequest
     * @return CreateDeviceVirtualGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceVirtualGroupResponse CreateDeviceVirtualGroup(CreateDeviceVirtualGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDeviceVirtualGroup", CreateDeviceVirtualGroupResponse.class);
    }

    /**
     *生成特权码，私有化调用path为：capi/Assets/Device/CreatePrivilegeCode，生成的特权码、卸载码，仅对该设备当天有效
     * @param req CreatePrivilegeCodeRequest
     * @return CreatePrivilegeCodeResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivilegeCodeResponse CreatePrivilegeCode(CreatePrivilegeCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrivilegeCode", CreatePrivilegeCodeResponse.class);
    }

    /**
     *以分页的方式查询账号分组列表，私有化调用path为：/capi/Assets/DescribeAccountGroups
     * @param req DescribeAccountGroupsRequest
     * @return DescribeAccountGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountGroupsResponse DescribeAccountGroups(DescribeAccountGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountGroups", DescribeAccountGroupsResponse.class);
    }

    /**
     *webservice查询文件检测结果
     * @param req DescribeDLPFileDetectResultRequest
     * @return DescribeDLPFileDetectResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDLPFileDetectResultResponse DescribeDLPFileDetectResult(DescribeDLPFileDetectResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDLPFileDetectResult", DescribeDLPFileDetectResultResponse.class);
    }

    /**
     *查询满足条件的查询终端硬件信息列表，私有化调用path为：/capi/Assets/Device/DescribeDeviceHardwareInfoList
     * @param req DescribeDeviceHardwareInfoListRequest
     * @return DescribeDeviceHardwareInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceHardwareInfoListResponse DescribeDeviceHardwareInfoList(DescribeDeviceHardwareInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceHardwareInfoList", DescribeDeviceHardwareInfoListResponse.class);
    }

    /**
     *获取终端进程网络服务信息，私有化调用path为：capi/Assets/Device/DescribeDeviceInfo
     * @param req DescribeDeviceInfoRequest
     * @return DescribeDeviceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceInfoResponse DescribeDeviceInfo(DescribeDeviceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceInfo", DescribeDeviceInfoResponse.class);
    }

    /**
     *查询满足条件的终端数据详情，私有化调用path为：/capi/Assets/Device/DescribeDevices
     * @param req DescribeDevicesRequest
     * @return DescribeDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicesResponse DescribeDevices(DescribeDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevices", DescribeDevicesResponse.class);
    }

    /**
     *获取账号列表，支持分页，模糊搜索，私有化调用path为：/capi/Assets/Account/DescribeLocalAccounts
     * @param req DescribeLocalAccountsRequest
     * @return DescribeLocalAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLocalAccountsResponse DescribeLocalAccounts(DescribeLocalAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLocalAccounts", DescribeLocalAccountsResponse.class);
    }

    /**
     *查询账号根分组详情。对应“用户与授权管理”里内置不可见的全网根账号组，所有新建的目录，都挂在该全网根账号组下。
     * @param req DescribeRootAccountGroupRequest
     * @return DescribeRootAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRootAccountGroupResponse DescribeRootAccountGroup(DescribeRootAccountGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRootAccountGroup", DescribeRootAccountGroupResponse.class);
    }

    /**
     *查看终端树下的软件列表,私有化调用path为：capi/Software/DescribeSoftCensusListByDevice
     * @param req DescribeSoftCensusListByDeviceRequest
     * @return DescribeSoftCensusListByDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSoftCensusListByDeviceResponse DescribeSoftCensusListByDevice(DescribeSoftCensusListByDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSoftCensusListByDevice", DescribeSoftCensusListByDeviceResponse.class);
    }

    /**
     *查看指定终端的软件详情列表,私有化调用path为：capi/Software/DescribeSoftwareInformation
     * @param req DescribeSoftwareInformationRequest
     * @return DescribeSoftwareInformationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSoftwareInformationResponse DescribeSoftwareInformation(DescribeSoftwareInformationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSoftwareInformation", DescribeSoftwareInformationResponse.class);
    }

}
