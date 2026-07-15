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
package com.tencentcloudapi.tke.v20220501;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tke.v20220501.models.*;

public class TkeClient extends AbstractClient{
    private static String endpoint = "tke.tencentcloudapi.com";
    private static String service = "tke";
    private static String version = "2022-05-01";

    public TkeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TkeClient(Credential credential, String region, ClientProfile profile) {
        super(TkeClient.endpoint, TkeClient.version, credential, region, profile);
    }

    /**
     *创建健康检测策略
     * @param req CreateHealthCheckPolicyRequest
     * @return CreateHealthCheckPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateHealthCheckPolicyResponse CreateHealthCheckPolicy(CreateHealthCheckPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHealthCheckPolicy", CreateHealthCheckPolicyResponse.class);
    }

    /**
     ***通过 CAM 策略强制节点池安全配置**

创建原生节点池（`CreateNodePool`）接口已接入 CAM 条件鉴权，会根据请求参数计算出一组**条件键（Condition Key）**并传入 CAM 鉴权。您可以在 CAM/SCP 策略中基于这些条件键配置 `deny` 规则，从而强制约束节点池的安全配置（如必须开启磁盘加密、安全加固等）。

**支持的条件键**

| 条件键 | 含义 | 取值 | 取值判定说明 |
|--------|------|------|-------------|
| `tke:NodePoolType` | 节点池类型 | `Native` / `External` | 取请求的节点池类型，未指定时默认为 `Native` |
| `tke:SystemDiskEncrypted` | 系统盘是否加密 | `true` / `false` | 系统盘加密属性为 `ENCRYPT`（大小写不敏感）时为 `true`，否则为 `false` |
| `tke:AllDataDisksEncrypted` | 所有数据盘是否都已加密 | `true` / `false` | 全部数据盘加密属性均为 `ENCRYPT` 时为 `true`；未配置数据盘时也为 `true`；只要有任一数据盘未加密即为 `false` |
| `tke:SecurityAgentEnabled` | 是否开启安全加固（Security Agent） | `true` / `false` | 开启安全加固时为 `true`，否则为 `false` |

> 说明：所有条件键的取值均为字符串 `"true"` / `"false"`，请在策略中使用字符串形式匹配。

**使用方式**

在 CAM 策略中使用 `bool_equal` 匹配条件键值为 `"false"`，配合 `effect: deny`，即可实现"未满足安全配置则拒绝创建节点池"的强制约束。

**示例一：强制开启安全加固**

创建节点池时若未开启安全加固（`tke:SecurityAgentEnabled = "false"`），则拒绝。

```json
{
    "version": "2.0",
    "statement": [
        {
            "effect": "deny",
            "action": ["tke:CreateNodePool"],
            "resource": ["*"],
            "condition": {
                "bool_equal": {
                    "tke:SecurityAgentEnabled": "false"
                }
            }
        }
    ]
}
```

**示例二：强制数据盘加密**

创建节点池时若存在未加密的数据盘（`tke:AllDataDisksEncrypted = "false"`），则拒绝。

```json
{
    "version": "2.0",
    "statement": [
        {
            "effect": "deny",
            "action": ["tke:CreateNodePool"],
            "resource": ["*"],
            "condition": {
                "bool_equal": {
                    "tke:AllDataDisksEncrypted": "false"
                }
            }
        }
    ]
}
```

**示例三：强制系统盘加密**

创建节点池时若系统盘未加密（`tke:SystemDiskEncrypted = "false"`），则拒绝。

```json
{
    "version": "2.0",
    "statement": [
        {
            "effect": "deny",
            "action": ["tke:CreateNodePool"],
            "resource": ["*"],
            "condition": {
                "bool_equal": {
                    "tke:SystemDiskEncrypted": "false"
                }
            }
        }
    ]
}
```

**注意事项**

- 上述条件键在**未配置任何 CAM 策略**时不会影响节点池创建，仅在您显式配置了对应 `deny` 策略时才生效。
- 如需同时强制多项安全配置，必须在同一策略的 `statement` 中配置多条 `deny` 规则，不能将多个条件键写入同一条 `condition`。
- `tke:AllDataDisksEncrypted` 在**无数据盘**场景下取值为 `true`（不存在未加密的数据盘），因此仅约束"已配置的数据盘必须加密"，不会强制要求必须挂载数据盘。
     * @param req CreateNodePoolRequest
     * @return CreateNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public CreateNodePoolResponse CreateNodePool(CreateNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNodePool", CreateNodePoolResponse.class);
    }

    /**
     *删除原生节点池节点
     * @param req DeleteClusterMachinesRequest
     * @return DeleteClusterMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterMachinesResponse DeleteClusterMachines(DeleteClusterMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterMachines", DeleteClusterMachinesResponse.class);
    }

    /**
     *删除健康检测策略
     * @param req DeleteHealthCheckPolicyRequest
     * @return DeleteHealthCheckPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHealthCheckPolicyResponse DeleteHealthCheckPolicy(DeleteHealthCheckPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteHealthCheckPolicy", DeleteHealthCheckPolicyResponse.class);
    }

    /**
     *删除 TKE 节点池
     * @param req DeleteNodePoolRequest
     * @return DeleteNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNodePoolResponse DeleteNodePool(DeleteNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNodePool", DeleteNodePoolResponse.class);
    }

    /**
     *查询集群下节点实例信息
     * @param req DescribeClusterInstancesRequest
     * @return DescribeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstancesResponse DescribeClusterInstances(DescribeClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterInstances", DescribeClusterInstancesResponse.class);
    }

    /**
     *查询托原生点列表
     * @param req DescribeClusterMachinesRequest
     * @return DescribeClusterMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterMachinesResponse DescribeClusterMachines(DescribeClusterMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterMachines", DescribeClusterMachinesResponse.class);
    }

    /**
     *查询集群列表
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusters", DescribeClustersResponse.class);
    }

    /**
     *请求该接口，会返回所有适配该机型和操作系统组合的gpu驱动版本
     * @param req DescribeGPUInfoRequest
     * @return DescribeGPUInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGPUInfoResponse DescribeGPUInfo(DescribeGPUInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGPUInfo", DescribeGPUInfoResponse.class);
    }

    /**
     *查询健康检测策略
     * @param req DescribeHealthCheckPoliciesRequest
     * @return DescribeHealthCheckPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHealthCheckPoliciesResponse DescribeHealthCheckPolicies(DescribeHealthCheckPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHealthCheckPolicies", DescribeHealthCheckPoliciesResponse.class);
    }

    /**
     *查询健康检测策略绑定关系
     * @param req DescribeHealthCheckPolicyBindingsRequest
     * @return DescribeHealthCheckPolicyBindingsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHealthCheckPolicyBindingsResponse DescribeHealthCheckPolicyBindings(DescribeHealthCheckPolicyBindingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHealthCheckPolicyBindings", DescribeHealthCheckPolicyBindingsResponse.class);
    }

    /**
     *查询健康检测策略模板
     * @param req DescribeHealthCheckTemplateRequest
     * @return DescribeHealthCheckTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHealthCheckTemplateResponse DescribeHealthCheckTemplate(DescribeHealthCheckTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHealthCheckTemplate", DescribeHealthCheckTemplateResponse.class);
    }

    /**
     *查询 TKE 节点池列表
     * @param req DescribeNodePoolsRequest
     * @return DescribeNodePoolsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodePoolsResponse DescribeNodePools(DescribeNodePoolsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodePools", DescribeNodePoolsResponse.class);
    }

    /**
     *查询节点池健康度相关信息
     * @param req DescribeNodePoolsElasticityStrengthRequest
     * @return DescribeNodePoolsElasticityStrengthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodePoolsElasticityStrengthResponse DescribeNodePoolsElasticityStrength(DescribeNodePoolsElasticityStrengthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodePoolsElasticityStrength", DescribeNodePoolsElasticityStrengthResponse.class);
    }

    /**
     *查询原生节点机型配置
     * @param req DescribeZoneInstanceConfigInfosRequest
     * @return DescribeZoneInstanceConfigInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneInstanceConfigInfosResponse DescribeZoneInstanceConfigInfos(DescribeZoneInstanceConfigInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZoneInstanceConfigInfos", DescribeZoneInstanceConfigInfosResponse.class);
    }

    /**
     *修改原生节点
     * @param req ModifyClusterMachineRequest
     * @return ModifyClusterMachineResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterMachineResponse ModifyClusterMachine(ModifyClusterMachineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterMachine", ModifyClusterMachineResponse.class);
    }

    /**
     *修改健康检测策略
     * @param req ModifyHealthCheckPolicyRequest
     * @return ModifyHealthCheckPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHealthCheckPolicyResponse ModifyHealthCheckPolicy(ModifyHealthCheckPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHealthCheckPolicy", ModifyHealthCheckPolicyResponse.class);
    }

    /**
     *更新 TKE 节点池
     * @param req ModifyNodePoolRequest
     * @return ModifyNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNodePoolResponse ModifyNodePool(ModifyNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNodePool", ModifyNodePoolResponse.class);
    }

    /**
     *重启原生节点实例
     * @param req RebootMachinesRequest
     * @return RebootMachinesResponse
     * @throws TencentCloudSDKException
     */
    public RebootMachinesResponse RebootMachines(RebootMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RebootMachines", RebootMachinesResponse.class);
    }

    /**
     *设置 TKE 节点池期望节点数
     * @param req ScaleNodePoolRequest
     * @return ScaleNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public ScaleNodePoolResponse ScaleNodePool(ScaleNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleNodePool", ScaleNodePoolResponse.class);
    }

    /**
     *设置是否开启节点登录
     * @param req SetMachineLoginRequest
     * @return SetMachineLoginResponse
     * @throws TencentCloudSDKException
     */
    public SetMachineLoginResponse SetMachineLogin(SetMachineLoginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetMachineLogin", SetMachineLoginResponse.class);
    }

    /**
     *本接口 (StartMachines) 用于启动一个或多个原生节点实例。

只有状态为 Stopped 的实例才可以进行此操作。
接口调用成功后，等待一分钟左右，实例会进入 Running 状态。
支持批量操作。每次请求批量实例的上限为100。
本接口为同步接口，启动实例请求发送成功后会返回一个RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeClusterInstances 接口查询，如果实例的状态为 Running，则代表启动实例操作成功。
     * @param req StartMachinesRequest
     * @return StartMachinesResponse
     * @throws TencentCloudSDKException
     */
    public StartMachinesResponse StartMachines(StartMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartMachines", StartMachinesResponse.class);
    }

    /**
     *本接口 (StopMachines) 用于关闭一个或多个原生节点实例。

只有状态为 Running 的实例才可以进行此操作。
接口调用成功时，实例会进入 Stopping 状态；关闭实例成功时，实例会进入 Stopped 状态。
支持强制关闭。强制关机的效果等同于关闭物理计算机的电源开关。强制关机可能会导致数据丢失或文件系统损坏，请仅在服务器不能正常关机时使用。
支持批量操作。每次请求批量实例的上限为 100。
本接口为同步接口，关闭实例请求发送成功后会返回一个RequestId，此时操作并未立即完成。实例操作结果可以通过调用 DescribeClusterInstances 接口查询，如果实例的状态为stopped_with_charging，则代表关闭实例操作成功。
     * @param req StopMachinesRequest
     * @return StopMachinesResponse
     * @throws TencentCloudSDKException
     */
    public StopMachinesResponse StopMachines(StopMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopMachines", StopMachinesResponse.class);
    }

}
