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
package com.tencentcloudapi.cvd.v20201104;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cvd.v20201104.models.*;

public class CvdClient extends AbstractClient{
    private static String endpoint = "cvd.tencentcloudapi.com";
    private static String service = "cvd";
    private static String version = "2020-11-04";

    public CvdClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CvdClient(Credential credential, String region, ClientProfile profile) {
        super(CvdClient.endpoint, CvdClient.version, credential, region, profile);
    }

    /**
     *安全组批量关联云桌面
     * @param req AssociateSecurityGroupRequest
     * @return AssociateSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupResponse AssociateSecurityGroup(AssociateSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateSecurityGroup", AssociateSecurityGroupResponse.class);
    }

    /**
     *绑定桌面
     * @param req BindInstancesRequest
     * @return BindInstancesResponse
     * @throws TencentCloudSDKException
     */
    public BindInstancesResponse BindInstances(BindInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindInstances", BindInstancesResponse.class);
    }

    /**
     *创建批量脚本任务
     * @param req CreateCommandTaskRequest
     * @return CreateCommandTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateCommandTaskResponse CreateCommandTask(CreateCommandTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCommandTask", CreateCommandTaskResponse.class);
    }

    /**
     *实例新增数据盘
     * @param req CreateDataDiskRequest
     * @return CreateDataDiskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataDiskResponse CreateDataDisk(CreateDataDiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataDisk", CreateDataDiskResponse.class);
    }

    /**
     *新建域名访问控制策略
     * @param req CreateDomainControlPolicyRequest
     * @return CreateDomainControlPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainControlPolicyResponse CreateDomainControlPolicy(CreateDomainControlPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainControlPolicy", CreateDomainControlPolicyResponse.class);
    }

    /**
     *创建自定义镜像。
     * @param req CreateImageRequest
     * @return CreateImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageResponse CreateImage(CreateImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImage", CreateImageResponse.class);
    }

    /**
     *创建云桌面实例
     * @param req CreateInstancesRequest
     * @return CreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancesResponse CreateInstances(CreateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstances", CreateInstancesResponse.class);
    }

    /**
     *创建策略
     * @param req CreatePolicyRequest
     * @return CreatePolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreatePolicyResponse CreatePolicy(CreatePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePolicy", CreatePolicyResponse.class);
    }

    /**
     *删除命令任务
     * @param req DeleteCommandTasksRequest
     * @return DeleteCommandTasksResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCommandTasksResponse DeleteCommandTasks(DeleteCommandTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCommandTasks", DeleteCommandTasksResponse.class);
    }

    /**
     *删除域名访问控制策略
     * @param req DeleteDomainControlPolicyRequest
     * @return DeleteDomainControlPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainControlPolicyResponse DeleteDomainControlPolicy(DeleteDomainControlPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomainControlPolicy", DeleteDomainControlPolicyResponse.class);
    }

    /**
     *用于删除一个或多个自定义镜像。单次最大删除5个。
     * @param req DeleteImagesRequest
     * @return DeleteImagesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImagesResponse DeleteImages(DeleteImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImages", DeleteImagesResponse.class);
    }

    /**
     *拉取命令任务详情
     * @param req DescribeCommandTasksRequest
     * @return DescribeCommandTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCommandTasksResponse DescribeCommandTasks(DescribeCommandTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCommandTasks", DescribeCommandTasksResponse.class);
    }

    /**
     *获取云桌面镜像详细信息
     * @param req DescribeImagesRequest
     * @return DescribeImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImagesResponse DescribeImages(DescribeImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImages", DescribeImagesResponse.class);
    }

    /**
     *获取指定实例的登录Fetch信息
     * @param req DescribeInstanceFetchMsgRequest
     * @return DescribeInstanceFetchMsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceFetchMsgResponse DescribeInstanceFetchMsg(DescribeInstanceFetchMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceFetchMsg", DescribeInstanceFetchMsgResponse.class);
    }

    /**
     *获取实例磁盘分区监控数据
     * @param req DescribeInstanceGraphDataRequest
     * @return DescribeInstanceGraphDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceGraphDataResponse DescribeInstanceGraphData(DescribeInstanceGraphDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceGraphData", DescribeInstanceGraphDataResponse.class);
    }

    /**
     *获取指定实例的登录login信息
     * @param req DescribeInstanceLoginMsgRequest
     * @return DescribeInstanceLoginMsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLoginMsgResponse DescribeInstanceLoginMsg(DescribeInstanceLoginMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceLoginMsg", DescribeInstanceLoginMsgResponse.class);
    }

    /**
     *查询实例监控数据
     * @param req DescribeInstanceMonitorDataRequest
     * @return DescribeInstanceMonitorDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorDataResponse DescribeInstanceMonitorData(DescribeInstanceMonitorDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorData", DescribeInstanceMonitorDataResponse.class);
    }

    /**
     *获取用户在各个区域云桌面实例个数
     * @param req DescribeInstanceRegionDistributionRequest
     * @return DescribeInstanceRegionDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceRegionDistributionResponse DescribeInstanceRegionDistribution(DescribeInstanceRegionDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceRegionDistribution", DescribeInstanceRegionDistributionResponse.class);
    }

    /**
     *获取云桌面实例详细信息
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *获取桌面实例绑定状态
     * @param req DescribeInstancesBindStatusRequest
     * @return DescribeInstancesBindStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesBindStatusResponse DescribeInstancesBindStatus(DescribeInstancesBindStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesBindStatus", DescribeInstancesBindStatusResponse.class);
    }

    /**
     *获取桌面实例状态
     * @param req DescribeInstancesStatusRequest
     * @return DescribeInstancesStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesStatusResponse DescribeInstancesStatus(DescribeInstancesStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesStatus", DescribeInstancesStatusResponse.class);
    }

    /**
     *查询脚本任务执行的详细情况。
     * @param req DescribeInvocationDetailRequest
     * @return DescribeInvocationDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationDetailResponse DescribeInvocationDetail(DescribeInvocationDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInvocationDetail", DescribeInvocationDetailResponse.class);
    }

    /**
     *查询指定云桌面上的任务列表。
     * @param req DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationsResponse DescribeInvocations(DescribeInvocationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInvocations", DescribeInvocationsResponse.class);
    }

    /**
     *拉取租户策略列表 
     * @param req DescribePolicyDetailRequest
     * @return DescribePolicyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyDetailResponse DescribePolicyDetail(DescribePolicyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePolicyDetail", DescribePolicyDetailResponse.class);
    }

    /**
     *拉取云桌面关联的安全组信息
     * @param req DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupsResponse DescribeSecurityGroups(DescribeSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroups", DescribeSecurityGroupsResponse.class);
    }

    /**
     *拉取快照列表
     * @param req DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsResponse DescribeSnapshots(DescribeSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshots", DescribeSnapshotsResponse.class);
    }

    /**
     *拉取实例使用时长详情
     * @param req DescribeUsageRequest
     * @return DescribeUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsageResponse DescribeUsage(DescribeUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsage", DescribeUsageResponse.class);
    }

    /**
     *拉取用户列表
     * @param req DescribeUsersRequest
     * @return DescribeUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsersResponse DescribeUsers(DescribeUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsers", DescribeUsersResponse.class);
    }

    /**
     *安全组批量解关联云桌面
     * @param req DisassociateSecurityGroupRequest
     * @return DisassociateSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupResponse DisassociateSecurityGroup(DisassociateSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateSecurityGroup", DisassociateSecurityGroupResponse.class);
    }

    /**
     *实例硬盘扩容
     * @param req ModifyDiskConfigurationRequest
     * @return ModifyDiskConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDiskConfigurationResponse ModifyDiskConfiguration(ModifyDiskConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDiskConfiguration", ModifyDiskConfigurationResponse.class);
    }

    /**
     *修改镜像属性
     * @param req ModifyImageAttrsRequest
     * @return ModifyImageAttrsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageAttrsResponse ModifyImageAttrs(ModifyImageAttrsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyImageAttrs", ModifyImageAttrsResponse.class);
    }

    /**
     *修改桌面实例属性
     * @param req ModifyInstanceBasicAttributeRequest
     * @return ModifyInstanceBasicAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceBasicAttributeResponse ModifyInstanceBasicAttribute(ModifyInstanceBasicAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceBasicAttribute", ModifyInstanceBasicAttributeResponse.class);
    }

    /**
     *调整实例机型配置
     * @param req ModifyInstancesTypeRequest
     * @return ModifyInstancesTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesTypeResponse ModifyInstancesType(ModifyInstancesTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesType", ModifyInstancesTypeResponse.class);
    }

    /**
     *调整实例私有网络
     * @param req ModifyInstancesVpcRequest
     * @return ModifyInstancesVpcResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesVpcResponse ModifyInstancesVpc(ModifyInstancesVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesVpc", ModifyInstancesVpcResponse.class);
    }

    /**
     *重启实例
     * @param req RebootInstancesRequest
     * @return RebootInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RebootInstancesResponse RebootInstances(RebootInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RebootInstances", RebootInstancesResponse.class);
    }

    /**
     *卸载实例数据盘
     * @param req RemoveDataDisksRequest
     * @return RemoveDataDisksResponse
     * @throws TencentCloudSDKException
     */
    public RemoveDataDisksResponse RemoveDataDisks(RemoveDataDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveDataDisks", RemoveDataDisksResponse.class);
    }

    /**
     *删除策略
     * @param req RemovePolicyRequest
     * @return RemovePolicyResponse
     * @throws TencentCloudSDKException
     */
    public RemovePolicyResponse RemovePolicy(RemovePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemovePolicy", RemovePolicyResponse.class);
    }

    /**
     *实例续费
     * @param req RenewInstancesRequest
     * @return RenewInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstancesResponse RenewInstances(RenewInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewInstances", RenewInstancesResponse.class);
    }

    /**
     *实例重置
     * @param req ResetInstancesRequest
     * @return ResetInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesResponse ResetInstances(ResetInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstances", ResetInstancesResponse.class);
    }

    /**
     *在指定的云桌面实例上执行脚本任务。
     * @param req RunCommandRequest
     * @return RunCommandResponse
     * @throws TencentCloudSDKException
     */
    public RunCommandResponse RunCommand(RunCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunCommand", RunCommandResponse.class);
    }

    /**
     *开启实例
     * @param req StartInstancesRequest
     * @return StartInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StartInstancesResponse StartInstances(StartInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartInstances", StartInstancesResponse.class);
    }

    /**
     *停止命令任务
     * @param req StopCommandTasksRequest
     * @return StopCommandTasksResponse
     * @throws TencentCloudSDKException
     */
    public StopCommandTasksResponse StopCommandTasks(StopCommandTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopCommandTasks", StopCommandTasksResponse.class);
    }

    /**
     *关闭实例
     * @param req StopInstancesRequest
     * @return StopInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StopInstancesResponse StopInstances(StopInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopInstances", StopInstancesResponse.class);
    }

    /**
     *停止脚本任务的执行。
     * @param req StopInvocationRequest
     * @return StopInvocationResponse
     * @throws TencentCloudSDKException
     */
    public StopInvocationResponse StopInvocation(StopInvocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopInvocation", StopInvocationResponse.class);
    }

    /**
     *注销或者断开机器当前会话
     * @param req StopSessionRequest
     * @return StopSessionResponse
     * @throws TencentCloudSDKException
     */
    public StopSessionResponse StopSession(StopSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopSession", StopSessionResponse.class);
    }

    /**
     *主动退还、销毁退还实例。 
<li>包年包月实例首次调用本接口，且参数DestroyImmediately为false时，实例进入隔离期，再次调用本接口，实例将被销毁，且不可恢复。</li>
<li>包年包月实例，如果参数DestroyImmediately为true来调用此接口，则实例将被直接销毁，且不可恢复。</li>
<li>按量计费实例调用本接口将被直接销毁，且不可恢复。</li>
     * @param req TerminateInstancesRequest
     * @return TerminateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstancesResponse TerminateInstances(TerminateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateInstances", TerminateInstancesResponse.class);
    }

    /**
     *解除用户和机器绑定关系
     * @param req UnbindInstancesRequest
     * @return UnbindInstancesResponse
     * @throws TencentCloudSDKException
     */
    public UnbindInstancesResponse UnbindInstances(UnbindInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindInstances", UnbindInstancesResponse.class);
    }

    /**
     *更新策略
     * @param req UpdatePolicyRequest
     * @return UpdatePolicyResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePolicyResponse UpdatePolicy(UpdatePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePolicy", UpdatePolicyResponse.class);
    }

}
