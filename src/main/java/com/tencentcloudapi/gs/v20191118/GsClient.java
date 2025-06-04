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
package com.tencentcloudapi.gs.v20191118;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.gs.v20191118.models.*;

public class GsClient extends AbstractClient{
    private static String endpoint = "gs.tencentcloudapi.com";
    private static String service = "gs";
    private static String version = "2019-11-18";
    
    public GsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public GsClient(Credential credential, String region, ClientProfile profile) {
        super(GsClient.endpoint, GsClient.version, credential, region, profile);
    }

    /**
     *备份云手机数据到指定存储，支持 COS 和兼容 AWS S3 协议的对象存储服务。如果是备份到 COS 时，会使用公网流量，授权 COS bucket 请在控制台中操作。
     * @param req BackUpAndroidInstanceToStorageRequest
     * @return BackUpAndroidInstanceToStorageResponse
     * @throws TencentCloudSDKException
     */
    public BackUpAndroidInstanceToStorageResponse BackUpAndroidInstanceToStorage(BackUpAndroidInstanceToStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BackUpAndroidInstanceToStorage", BackUpAndroidInstanceToStorageResponse.class);
    }

    /**
     *连接安卓实例
     * @param req ConnectAndroidInstanceRequest
     * @return ConnectAndroidInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ConnectAndroidInstanceResponse ConnectAndroidInstance(ConnectAndroidInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConnectAndroidInstance", ConnectAndroidInstanceResponse.class);
    }

    /**
     *复制安卓实例：
1. 排除和包含文件只能指定 /data 下的文件，不指定时复制整个 /data 目录
2. 源实例和目的实例必须在同一区域
3. 复制时，源实例和目的实例都会停机，复制完后实例会自动启动
4. 复制时会产生大量内网流量，请限制并发
     * @param req CopyAndroidInstanceRequest
     * @return CopyAndroidInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CopyAndroidInstanceResponse CopyAndroidInstance(CopyAndroidInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyAndroidInstance", CopyAndroidInstanceResponse.class);
    }

    /**
     *创建安卓应用
     * @param req CreateAndroidAppRequest
     * @return CreateAndroidAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndroidAppResponse CreateAndroidApp(CreateAndroidAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAndroidApp", CreateAndroidAppResponse.class);
    }

    /**
     *创建安卓应用版本
     * @param req CreateAndroidAppVersionRequest
     * @return CreateAndroidAppVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndroidAppVersionResponse CreateAndroidAppVersion(CreateAndroidAppVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAndroidAppVersion", CreateAndroidAppVersionResponse.class);
    }

    /**
     *创建云手机实例 ADB 连接信息，请将返回结果的 PrivateKey 字段保存为 pem 文件，并将 pem 文件权限设置为 600，再参考返回结果的 ConnectCommand 使用 adb 连接实例。
     * @param req CreateAndroidInstanceADBRequest
     * @return CreateAndroidInstanceADBResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndroidInstanceADBResponse CreateAndroidInstanceADB(CreateAndroidInstanceADBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAndroidInstanceADB", CreateAndroidInstanceADBResponse.class);
    }

    /**
     *创建安卓实例镜像
     * @param req CreateAndroidInstanceImageRequest
     * @return CreateAndroidInstanceImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndroidInstanceImageResponse CreateAndroidInstanceImage(CreateAndroidInstanceImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAndroidInstanceImage", CreateAndroidInstanceImageResponse.class);
    }

    /**
     *创建安卓实例
     * @param req CreateAndroidInstanceLabelRequest
     * @return CreateAndroidInstanceLabelResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndroidInstanceLabelResponse CreateAndroidInstanceLabel(CreateAndroidInstanceLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAndroidInstanceLabel", CreateAndroidInstanceLabelResponse.class);
    }

    /**
     *创建安卓实例 SSH 连接信息，请将返回结果的 PrivateKey 字段保存为 pem 文件，并将 pem 文件权限设置为 600，再参考返回结果的 ConnectCommand 使用 ssh 连接实例。
     * @param req CreateAndroidInstanceSSHRequest
     * @return CreateAndroidInstanceSSHResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndroidInstanceSSHResponse CreateAndroidInstanceSSH(CreateAndroidInstanceSSHRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAndroidInstanceSSH", CreateAndroidInstanceSSHResponse.class);
    }

    /**
     *创建安卓实例 WebShell 连接信息，返回的 ConnectUrl 可通过浏览器直接打开访问，链接有效期 1 小时，链接打开后可持续使用。
     * @param req CreateAndroidInstanceWebShellRequest
     * @return CreateAndroidInstanceWebShellResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndroidInstanceWebShellResponse CreateAndroidInstanceWebShell(CreateAndroidInstanceWebShellRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAndroidInstanceWebShell", CreateAndroidInstanceWebShellResponse.class);
    }

    /**
     *创建安卓实例
     * @param req CreateAndroidInstancesRequest
     * @return CreateAndroidInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndroidInstancesResponse CreateAndroidInstances(CreateAndroidInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAndroidInstances", CreateAndroidInstancesResponse.class);
    }

    /**
     *安卓实例截图
     * @param req CreateAndroidInstancesScreenshotRequest
     * @return CreateAndroidInstancesScreenshotResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndroidInstancesScreenshotResponse CreateAndroidInstancesScreenshot(CreateAndroidInstancesScreenshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAndroidInstancesScreenshot", CreateAndroidInstancesScreenshotResponse.class);
    }

    /**
     *用于创建 Cos 临时密钥
     * @param req CreateCosCredentialRequest
     * @return CreateCosCredentialResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosCredentialResponse CreateCosCredential(CreateCosCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCosCredential", CreateCosCredentialResponse.class);
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
     *删除安卓应用
     * @param req DeleteAndroidAppRequest
     * @return DeleteAndroidAppResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAndroidAppResponse DeleteAndroidApp(DeleteAndroidAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAndroidApp", DeleteAndroidAppResponse.class);
    }

    /**
     *删除安卓应用版本
     * @param req DeleteAndroidAppVersionRequest
     * @return DeleteAndroidAppVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAndroidAppVersionResponse DeleteAndroidAppVersion(DeleteAndroidAppVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAndroidAppVersion", DeleteAndroidAppVersionResponse.class);
    }

    /**
     *删除安卓实例镜像
     * @param req DeleteAndroidInstanceImagesRequest
     * @return DeleteAndroidInstanceImagesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAndroidInstanceImagesResponse DeleteAndroidInstanceImages(DeleteAndroidInstanceImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAndroidInstanceImages", DeleteAndroidInstanceImagesResponse.class);
    }

    /**
     *创建安卓实例
     * @param req DeleteAndroidInstanceLabelRequest
     * @return DeleteAndroidInstanceLabelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAndroidInstanceLabelResponse DeleteAndroidInstanceLabel(DeleteAndroidInstanceLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAndroidInstanceLabel", DeleteAndroidInstanceLabelResponse.class);
    }

    /**
     *查询安卓应用信息
     * @param req DescribeAndroidAppsRequest
     * @return DescribeAndroidAppsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAndroidAppsResponse DescribeAndroidApps(DescribeAndroidAppsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAndroidApps", DescribeAndroidAppsResponse.class);
    }

    /**
     *查询安卓实例应用
     * @param req DescribeAndroidInstanceAppsRequest
     * @return DescribeAndroidInstanceAppsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAndroidInstanceAppsResponse DescribeAndroidInstanceApps(DescribeAndroidInstanceAppsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAndroidInstanceApps", DescribeAndroidInstanceAppsResponse.class);
    }

    /**
     *查询安卓实例镜像
     * @param req DescribeAndroidInstanceImagesRequest
     * @return DescribeAndroidInstanceImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAndroidInstanceImagesResponse DescribeAndroidInstanceImages(DescribeAndroidInstanceImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAndroidInstanceImages", DescribeAndroidInstanceImagesResponse.class);
    }

    /**
     *创建安卓实例
     * @param req DescribeAndroidInstanceLabelsRequest
     * @return DescribeAndroidInstanceLabelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAndroidInstanceLabelsResponse DescribeAndroidInstanceLabels(DescribeAndroidInstanceLabelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAndroidInstanceLabels", DescribeAndroidInstanceLabelsResponse.class);
    }

    /**
     *查询安卓实例任务状态
     * @param req DescribeAndroidInstanceTasksStatusRequest
     * @return DescribeAndroidInstanceTasksStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAndroidInstanceTasksStatusResponse DescribeAndroidInstanceTasksStatus(DescribeAndroidInstanceTasksStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAndroidInstanceTasksStatus", DescribeAndroidInstanceTasksStatusResponse.class);
    }

    /**
     *查询安卓实例
     * @param req DescribeAndroidInstancesRequest
     * @return DescribeAndroidInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAndroidInstancesResponse DescribeAndroidInstances(DescribeAndroidInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAndroidInstances", DescribeAndroidInstancesResponse.class);
    }

    /**
     *获取并发总数和运行数
     * @param req DescribeInstancesCountRequest
     * @return DescribeInstancesCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesCountResponse DescribeInstancesCount(DescribeInstancesCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesCount", DescribeInstancesCountResponse.class);
    }

    /**
     *销毁安卓实例
     * @param req DestroyAndroidInstancesRequest
     * @return DestroyAndroidInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DestroyAndroidInstancesResponse DestroyAndroidInstances(DestroyAndroidInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyAndroidInstances", DestroyAndroidInstancesResponse.class);
    }

    /**
     *将一个文件批量分发到多个实例，一次接口调用触发一次文件分发，一次文件分发只会从公网下载一次，然后文件会走内网分发到实例列表中的实例。
     * @param req DistributeFileToAndroidInstancesRequest
     * @return DistributeFileToAndroidInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DistributeFileToAndroidInstancesResponse DistributeFileToAndroidInstances(DistributeFileToAndroidInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DistributeFileToAndroidInstances", DistributeFileToAndroidInstancesResponse.class);
    }

    /**
     *在安卓实例上异步执行命令，命令输出结果如果内容过长会被截断
     * @param req ExecuteCommandOnAndroidInstancesRequest
     * @return ExecuteCommandOnAndroidInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteCommandOnAndroidInstancesResponse ExecuteCommandOnAndroidInstances(ExecuteCommandOnAndroidInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExecuteCommandOnAndroidInstances", ExecuteCommandOnAndroidInstancesResponse.class);
    }

    /**
     *批量将实例的 logcat 日志文件上传到您已授权的 COS bucket 中，授权 COS bucket 请在控制台中操作。
     * @param req FetchAndroidInstancesLogsRequest
     * @return FetchAndroidInstancesLogsResponse
     * @throws TencentCloudSDKException
     */
    public FetchAndroidInstancesLogsResponse FetchAndroidInstancesLogs(FetchAndroidInstancesLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FetchAndroidInstancesLogs", FetchAndroidInstancesLogsResponse.class);
    }

    /**
     *安装安卓实例应用
     * @param req InstallAndroidInstancesAppRequest
     * @return InstallAndroidInstancesAppResponse
     * @throws TencentCloudSDKException
     */
    public InstallAndroidInstancesAppResponse InstallAndroidInstancesApp(InstallAndroidInstancesAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstallAndroidInstancesApp", InstallAndroidInstancesAppResponse.class);
    }

    /**
     *安装安卓实例应用
     * @param req InstallAndroidInstancesAppWithURLRequest
     * @return InstallAndroidInstancesAppWithURLResponse
     * @throws TencentCloudSDKException
     */
    public InstallAndroidInstancesAppWithURLResponse InstallAndroidInstancesAppWithURL(InstallAndroidInstancesAppWithURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstallAndroidInstancesAppWithURL", InstallAndroidInstancesAppWithURLResponse.class);
    }

    /**
     *修改安卓应用信息
     * @param req ModifyAndroidAppRequest
     * @return ModifyAndroidAppResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAndroidAppResponse ModifyAndroidApp(ModifyAndroidAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAndroidApp", ModifyAndroidAppResponse.class);
    }

    /**
     *修改安卓应用版本
     * @param req ModifyAndroidAppVersionRequest
     * @return ModifyAndroidAppVersionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAndroidAppVersionResponse ModifyAndroidAppVersion(ModifyAndroidAppVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAndroidAppVersion", ModifyAndroidAppVersionResponse.class);
    }

    /**
     *修改安卓实例的信息
     * @param req ModifyAndroidInstanceInformationRequest
     * @return ModifyAndroidInstanceInformationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAndroidInstanceInformationResponse ModifyAndroidInstanceInformation(ModifyAndroidInstanceInformationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAndroidInstanceInformation", ModifyAndroidInstanceInformationResponse.class);
    }

    /**
     *修改安卓实例分辨率。需要注意的是该接口可能导致正在运行的应用出现闪退，所以建议在实例维护时期才进行调用。
     * @param req ModifyAndroidInstanceResolutionRequest
     * @return ModifyAndroidInstanceResolutionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAndroidInstanceResolutionResponse ModifyAndroidInstanceResolution(ModifyAndroidInstanceResolutionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAndroidInstanceResolution", ModifyAndroidInstanceResolutionResponse.class);
    }

    /**
     *批量修改安卓实例信息
     * @param req ModifyAndroidInstancesInformationRequest
     * @return ModifyAndroidInstancesInformationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAndroidInstancesInformationResponse ModifyAndroidInstancesInformation(ModifyAndroidInstancesInformationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAndroidInstancesInformation", ModifyAndroidInstancesInformationResponse.class);
    }

    /**
     *修改安卓实例分辨率。需要注意的是该接口可能导致正在运行的应用出现闪退，所以建议在实例维护时期才进行调用。
     * @param req ModifyAndroidInstancesLabelsRequest
     * @return ModifyAndroidInstancesLabelsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAndroidInstancesLabelsResponse ModifyAndroidInstancesLabels(ModifyAndroidInstancesLabelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAndroidInstancesLabels", ModifyAndroidInstancesLabelsResponse.class);
    }

    /**
     *批量修改安卓实例属性
     * @param req ModifyAndroidInstancesPropertiesRequest
     * @return ModifyAndroidInstancesPropertiesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAndroidInstancesPropertiesResponse ModifyAndroidInstancesProperties(ModifyAndroidInstancesPropertiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAndroidInstancesProperties", ModifyAndroidInstancesPropertiesResponse.class);
    }

    /**
     *修改安卓实例分辨率。需要注意的是该接口需要重启才能生效。
     * @param req ModifyAndroidInstancesResolutionRequest
     * @return ModifyAndroidInstancesResolutionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAndroidInstancesResolutionResponse ModifyAndroidInstancesResolution(ModifyAndroidInstancesResolutionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAndroidInstancesResolution", ModifyAndroidInstancesResolutionResponse.class);
    }

    /**
     *批量修改安卓实例的用户ID
     * @param req ModifyAndroidInstancesUserIdRequest
     * @return ModifyAndroidInstancesUserIdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAndroidInstancesUserIdResponse ModifyAndroidInstancesUserId(ModifyAndroidInstancesUserIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAndroidInstancesUserId", ModifyAndroidInstancesUserIdResponse.class);
    }

    /**
     *重启安卓实例宿主机。请注意：

- 当前每 15 分钟只能重启一次
- 一个宿主机可能有多个云手机实例，重启宿主机会影响运行在上面的所有实例，请确保该宿主机上的所有云手机实例未投入业务使用
     * @param req RebootAndroidInstanceHostsRequest
     * @return RebootAndroidInstanceHostsResponse
     * @throws TencentCloudSDKException
     */
    public RebootAndroidInstanceHostsResponse RebootAndroidInstanceHosts(RebootAndroidInstanceHostsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RebootAndroidInstanceHosts", RebootAndroidInstanceHostsResponse.class);
    }

    /**
     *重启安卓实例
     * @param req RebootAndroidInstancesRequest
     * @return RebootAndroidInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RebootAndroidInstancesResponse RebootAndroidInstances(RebootAndroidInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RebootAndroidInstances", RebootAndroidInstancesResponse.class);
    }

    /**
     *重置安卓实例
     * @param req ResetAndroidInstancesRequest
     * @return ResetAndroidInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ResetAndroidInstancesResponse ResetAndroidInstances(ResetAndroidInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetAndroidInstances", ResetAndroidInstancesResponse.class);
    }

    /**
     *启动安卓实例应用
     * @param req RestartAndroidInstancesAppRequest
     * @return RestartAndroidInstancesAppResponse
     * @throws TencentCloudSDKException
     */
    public RestartAndroidInstancesAppResponse RestartAndroidInstancesApp(RestartAndroidInstancesAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartAndroidInstancesApp", RestartAndroidInstancesAppResponse.class);
    }

    /**
     *使用指定存储数据还原云手机，支持 COS 和兼容 AWS S3 协议的对象存储服务。如果还原数据来自 COS 时，会使用公网流量，授权 COS bucket 请在控制台中操作。
     * @param req RestoreAndroidInstanceFromStorageRequest
     * @return RestoreAndroidInstanceFromStorageResponse
     * @throws TencentCloudSDKException
     */
    public RestoreAndroidInstanceFromStorageResponse RestoreAndroidInstanceFromStorage(RestoreAndroidInstanceFromStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestoreAndroidInstanceFromStorage", RestoreAndroidInstanceFromStorageResponse.class);
    }

    /**
     *保存游戏存档
     * @param req SaveGameArchiveRequest
     * @return SaveGameArchiveResponse
     * @throws TencentCloudSDKException
     */
    public SaveGameArchiveResponse SaveGameArchive(SaveGameArchiveRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SaveGameArchive", SaveGameArchiveResponse.class);
    }

    /**
     *重启安卓实例
     * @param req StartAndroidInstancesRequest
     * @return StartAndroidInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StartAndroidInstancesResponse StartAndroidInstances(StartAndroidInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartAndroidInstances", StartAndroidInstancesResponse.class);
    }

    /**
     *启动安卓实例应用
     * @param req StartAndroidInstancesAppRequest
     * @return StartAndroidInstancesAppResponse
     * @throws TencentCloudSDKException
     */
    public StartAndroidInstancesAppResponse StartAndroidInstancesApp(StartAndroidInstancesAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartAndroidInstancesApp", StartAndroidInstancesAppResponse.class);
    }

    /**
     *开始云端推流
     * @param req StartPublishStreamRequest
     * @return StartPublishStreamResponse
     * @throws TencentCloudSDKException
     */
    public StartPublishStreamResponse StartPublishStream(StartPublishStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartPublishStream", StartPublishStreamResponse.class);
    }

    /**
     *开始云端推流
     * @param req StartPublishStreamToCSSRequest
     * @return StartPublishStreamToCSSResponse
     * @throws TencentCloudSDKException
     */
    public StartPublishStreamToCSSResponse StartPublishStreamToCSS(StartPublishStreamToCSSRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartPublishStreamToCSS", StartPublishStreamToCSSResponse.class);
    }

    /**
     *重启安卓实例
     * @param req StopAndroidInstancesRequest
     * @return StopAndroidInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StopAndroidInstancesResponse StopAndroidInstances(StopAndroidInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopAndroidInstances", StopAndroidInstancesResponse.class);
    }

    /**
     *停止安卓实例应用
     * @param req StopAndroidInstancesAppRequest
     * @return StopAndroidInstancesAppResponse
     * @throws TencentCloudSDKException
     */
    public StopAndroidInstancesAppResponse StopAndroidInstancesApp(StopAndroidInstancesAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopAndroidInstancesApp", StopAndroidInstancesAppResponse.class);
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

    /**
     *切换游戏存档
     * @param req SwitchGameArchiveRequest
     * @return SwitchGameArchiveResponse
     * @throws TencentCloudSDKException
     */
    public SwitchGameArchiveResponse SwitchGameArchive(SwitchGameArchiveRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchGameArchive", SwitchGameArchiveResponse.class);
    }

    /**
     *同步安卓实例镜像
     * @param req SyncAndroidInstanceImageRequest
     * @return SyncAndroidInstanceImageResponse
     * @throws TencentCloudSDKException
     */
    public SyncAndroidInstanceImageResponse SyncAndroidInstanceImage(SyncAndroidInstanceImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncAndroidInstanceImage", SyncAndroidInstanceImageResponse.class);
    }

    /**
     *在安卓实例上同步执行命令，仅支持1秒内可以返回结果的命令，例如：ls、cd。同时执行的实例数量不能过多，否则可能云api返回超时。不支持超过1秒无法返回或无法自主结束的命令，例如：top、vim，执行结果最大1KB
     * @param req SyncExecuteCommandOnAndroidInstancesRequest
     * @return SyncExecuteCommandOnAndroidInstancesResponse
     * @throws TencentCloudSDKException
     */
    public SyncExecuteCommandOnAndroidInstancesResponse SyncExecuteCommandOnAndroidInstances(SyncExecuteCommandOnAndroidInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncExecuteCommandOnAndroidInstances", SyncExecuteCommandOnAndroidInstancesResponse.class);
    }

    /**
     *尝试锁定机器
     * @param req TrylockWorkerRequest
     * @return TrylockWorkerResponse
     * @throws TencentCloudSDKException
     */
    public TrylockWorkerResponse TrylockWorker(TrylockWorkerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TrylockWorker", TrylockWorkerResponse.class);
    }

    /**
     *卸载安卓实例应用
     * @param req UninstallAndroidInstancesAppRequest
     * @return UninstallAndroidInstancesAppResponse
     * @throws TencentCloudSDKException
     */
    public UninstallAndroidInstancesAppResponse UninstallAndroidInstancesApp(UninstallAndroidInstancesAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UninstallAndroidInstancesApp", UninstallAndroidInstancesAppResponse.class);
    }

    /**
     *将文件下载到指定实例列表的实例上，每个实例都会从公网下载文件。如果您需要将同一个文件分发到多个实例，建议使用 DistributeFileToAndroidInstances 接口减少公网下载的流量。如果您需要将不同的文件下载到不同的实例，可考虑使用 UploadFilesToAndroidInstances 接口批量将不同文件下载到不同的实例。
     * @param req UploadFileToAndroidInstancesRequest
     * @return UploadFileToAndroidInstancesResponse
     * @throws TencentCloudSDKException
     */
    public UploadFileToAndroidInstancesResponse UploadFileToAndroidInstances(UploadFileToAndroidInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadFileToAndroidInstances", UploadFileToAndroidInstancesResponse.class);
    }

    /**
     *批量将不同的文件下载到不同的实例，每个实例下载文件都是从公网下载，建议只用在文件下载使用一次的场景。如果您需要将同一个文件分发到不同实例，建议使用 DistributeFileToAndroidInstances 接口。
     * @param req UploadFilesToAndroidInstancesRequest
     * @return UploadFilesToAndroidInstancesResponse
     * @throws TencentCloudSDKException
     */
    public UploadFilesToAndroidInstancesResponse UploadFilesToAndroidInstances(UploadFilesToAndroidInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadFilesToAndroidInstances", UploadFilesToAndroidInstancesResponse.class);
    }

}
