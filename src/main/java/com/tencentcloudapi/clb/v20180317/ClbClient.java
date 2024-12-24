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
package com.tencentcloudapi.clb.v20180317;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.clb.v20180317.models.*;

public class ClbClient extends AbstractClient{
    private static String endpoint = "clb.tencentcloudapi.com";
    private static String service = "clb";
    private static String version = "2018-03-17";
    
    public ClbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ClbClient(Credential credential, String region, ClientProfile profile) {
        super(ClbClient.endpoint, ClbClient.version, credential, region, profile);
    }

    /**
     *本接口(AssociateTargetGroups)用来将目标组绑定到负载均衡的监听器（四层协议）或转发规则（七层协议）上。
本接口为异步接口，本接口返回成功后需以返回的 RequestID 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
     * @param req AssociateTargetGroupsRequest
     * @return AssociateTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateTargetGroupsResponse AssociateTargetGroups(AssociateTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateTargetGroups", AssociateTargetGroupsResponse.class);
    }

    /**
     *用户需要先创建出一个HTTPS:443监听器，并在其下创建转发规则。通过调用本接口，系统会自动创建出一个HTTP:80监听器（如果之前不存在），并在其下创建转发规则，与HTTPS:443监听器下的Domains（在入参中指定）对应。创建成功后可以通过HTTP:80地址自动跳转为HTTPS:443地址进行访问。
本接口为异步接口，本接口返回成功后需以返回的RequestID为入参，调用DescribeTaskStatus接口查询本次任务是否成功。
     * @param req AutoRewriteRequest
     * @return AutoRewriteResponse
     * @throws TencentCloudSDKException
     */
    public AutoRewriteResponse AutoRewrite(AutoRewriteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AutoRewrite", AutoRewriteResponse.class);
    }

    /**
     *批量解绑四七层后端服务。批量解绑的资源数量上限为500。只支持VPC网络负载均衡。
     * @param req BatchDeregisterTargetsRequest
     * @return BatchDeregisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeregisterTargetsResponse BatchDeregisterTargets(BatchDeregisterTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeregisterTargets", BatchDeregisterTargetsResponse.class);
    }

    /**
     *BatchModifyTargetTag 接口用于批量修改负载均衡监听器绑定的后端机器的标签。批量修改的资源数量上限为500。本接口为同步接口。<br/>负载均衡的4层和7层监听器支持此接口，传统型负载均衡不支持。
     * @param req BatchModifyTargetTagRequest
     * @return BatchModifyTargetTagResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyTargetTagResponse BatchModifyTargetTag(BatchModifyTargetTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyTargetTag", BatchModifyTargetTagResponse.class);
    }

    /**
     *BatchModifyTargetWeight 接口用于批量修改负载均衡监听器绑定的后端机器的转发权重。批量修改的资源数量上限为500。本接口为异步接口，本接口返回成功后需以返回的 RequestID 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。<br/>负载均衡的4层和7层监听器支持此接口，传统型负载均衡不支持。

     * @param req BatchModifyTargetWeightRequest
     * @return BatchModifyTargetWeightResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyTargetWeightResponse BatchModifyTargetWeight(BatchModifyTargetWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyTargetWeight", BatchModifyTargetWeightResponse.class);
    }

    /**
     *批量绑定虚拟主机或弹性网卡，支持跨域绑定，支持四层、七层（TCP、UDP、HTTP、HTTPS）协议绑定。批量绑定的资源数量上限为500。只支持VPC网络负载均衡。
     * @param req BatchRegisterTargetsRequest
     * @return BatchRegisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public BatchRegisterTargetsResponse BatchRegisterTargets(BatchRegisterTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchRegisterTargets", BatchRegisterTargetsResponse.class);
    }

    /**
     *克隆负载均衡实例，根据指定的负载均衡实例，复制出相同规则和绑定关系的负载均衡实例。克隆接口为异步操作，克隆的数据以调用CloneLoadBalancer时为准，如果调用CloneLoadBalancer后克隆CLB发生变化，变化规则不会克隆。

注：查询实例创建状态可以根据返回值中的requestId访问[DescribeTaskStatus](https://cloud.tencent.com/document/product/214/30683)接口

限制说明
实例属性维度限制：
- 支持克隆网络计费模式为按量计费与包年包月的实例，包年包月实例克隆后的新实例网络计费模式会转换为按小时带宽计费，其带宽、规格与原实例设置保持一致。
- 不支持克隆未关联实例计费项的 CLB。
- 不支持克隆传统型负载均衡实例和高防 CLB。
- 不支持克隆基础网络类型的实例。
- 不支持克隆 Anycast 类型的实例。
- 不支持克隆 IPv6 NAT64 版本的实例。
- 不支持克隆被封禁或冻结的实例。
- 执行克隆操作前，请确保实例上没有使用已过期证书，否则会导致克隆失败。
配额维度限制：
- 当实例的监听器个数超过 50 个时，不支持克隆。
- 当共享型实例的公网带宽上限超过 2G 时，不支持克隆。

通过接口调用：
BGP带宽包必须传带宽包id
独占集群克隆必须传对应的参数，否则按共享型创建
     * @param req CloneLoadBalancerRequest
     * @return CloneLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public CloneLoadBalancerResponse CloneLoadBalancer(CloneLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneLoadBalancer", CloneLoadBalancerResponse.class);
    }

    /**
     *创建CLB专有日志集，此日志集用于存储CLB的日志。
     * @param req CreateClsLogSetRequest
     * @return CreateClsLogSetResponse
     * @throws TencentCloudSDKException
     */
    public CreateClsLogSetResponse CreateClsLogSet(CreateClsLogSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClsLogSet", CreateClsLogSetResponse.class);
    }

    /**
     *在一个负载均衡实例下创建监听器。
本接口为异步接口，接口返回成功后，需以返回的 RequestId 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
     * @param req CreateListenerRequest
     * @return CreateListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateListenerResponse CreateListener(CreateListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateListener", CreateListenerResponse.class);
    }

    /**
     *本接口(CreateLoadBalancer)用来创建负载均衡实例（本接口只支持购买按量计费的负载均衡，包年包月的负载均衡请通过控制台购买）。为了使用负载均衡服务，您必须购买一个或多个负载均衡实例。成功调用该接口后，会返回负载均衡实例的唯一 ID。负载均衡实例的类型分为：公网、内网。详情可参考产品说明中的产品类型。
注意：(1)可通过 [DescribeResources](https://cloud.tencent.com/document/api/214/70213) 接口查询一个地域是否支持创建IPv6实例；(2)一个账号在每个地域的默认购买配额为：公网100个，内网100个。
本接口为异步接口，接口成功返回后，可使用 DescribeLoadBalancers 接口查询负载均衡实例的状态（如创建中、正常），以确定是否创建成功。
     * @param req CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancerResponse CreateLoadBalancer(CreateLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoadBalancer", CreateLoadBalancerResponse.class);
    }

    /**
     *针对SnatPro负载均衡，这个接口用于添加SnatIp，如果负载均衡没有开启SnatPro，添加SnatIp后会自动开启。
本接口为异步接口，接口返回成功后，需以得到的 RequestID 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
     * @param req CreateLoadBalancerSnatIpsRequest
     * @return CreateLoadBalancerSnatIpsResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancerSnatIpsResponse CreateLoadBalancerSnatIps(CreateLoadBalancerSnatIpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoadBalancerSnatIps", CreateLoadBalancerSnatIpsResponse.class);
    }

    /**
     *CreateRule 接口用于在一个已存在的负载均衡七层监听器下创建转发规则，七层监听器中，后端服务必须绑定到规则上而非监听器上。
本接口为异步接口，本接口返回成功后需以返回的RequestID为入参，调用DescribeTaskStatus接口查询本次任务是否成功。
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRule", CreateRuleResponse.class);
    }

    /**
     *创建目标组。该功能正在内测中，如需使用，请通过[工单申请](https://console.cloud.tencent.com/workorder/category?level1_id=6&level2_id=163&source=0&data_title=%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%20LB&step=1)。
     * @param req CreateTargetGroupRequest
     * @return CreateTargetGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateTargetGroupResponse CreateTargetGroup(CreateTargetGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTargetGroup", CreateTargetGroupResponse.class);
    }

    /**
     *创建主题，默认开启全文索引和键值索引。如果不存在CLB专有日志集，则创建失败。
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopic", CreateTopicResponse.class);
    }

    /**
     *本接口用来删除负载均衡实例下的监听器（四层和七层）。
本接口为异步接口，接口返回成功后，需以得到的 RequestID 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
     * @param req DeleteListenerRequest
     * @return DeleteListenerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenerResponse DeleteListener(DeleteListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteListener", DeleteListenerResponse.class);
    }

    /**
     *DeleteLoadBalancer 接口用以删除指定的一个或多个负载均衡实例。成功删除后，会把负载均衡实例下的监听器、转发规则一起删除，并把后端服务解绑。
本接口为异步接口，接口返回成功后，需以返回的 RequestId 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
     * @param req DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerResponse DeleteLoadBalancer(DeleteLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancer", DeleteLoadBalancerResponse.class);
    }

    /**
     *该接口支持删除负载均衡的多个监听器。
本接口为异步接口，本接口返回成功后需以返回的 RequestID 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
     * @param req DeleteLoadBalancerListenersRequest
     * @return DeleteLoadBalancerListenersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerListenersResponse DeleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancerListeners", DeleteLoadBalancerListenersResponse.class);
    }

    /**
     *这个接口用于删除SnatPro的负载均衡的SnatIp。
本接口为异步接口，接口返回成功后，需以得到的 RequestID 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
     * @param req DeleteLoadBalancerSnatIpsRequest
     * @return DeleteLoadBalancerSnatIpsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerSnatIpsResponse DeleteLoadBalancerSnatIps(DeleteLoadBalancerSnatIpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancerSnatIps", DeleteLoadBalancerSnatIpsResponse.class);
    }

    /**
     *DeleteRewrite 接口支持删除指定转发规则之间的重定向关系。
本接口为异步接口，本接口返回成功后需以返回的RequestID为入参，调用DescribeTaskStatus接口查询本次任务是否成功。
     * @param req DeleteRewriteRequest
     * @return DeleteRewriteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRewriteResponse DeleteRewrite(DeleteRewriteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRewrite", DeleteRewriteResponse.class);
    }

    /**
     *DeleteRule 接口用来删除负载均衡实例七层监听器下的转发规则。
本接口为异步接口，本接口返回成功后需以返回的RequestID为入参，调用DescribeTaskStatus接口查询本次任务是否成功。
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRule", DeleteRuleResponse.class);
    }

    /**
     *删除目标组
     * @param req DeleteTargetGroupsRequest
     * @return DeleteTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTargetGroupsResponse DeleteTargetGroups(DeleteTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTargetGroups", DeleteTargetGroupsResponse.class);
    }

    /**
     *DeregisterFunctionTargets 接口用来将一个云函数从负载均衡的转发规则上解绑，对于七层监听器，还需通过 LocationId 或 Domain+Url 指定转发规则。
本接口为异步接口，本接口返回成功后需以返回的 RequestID 为入参，调用 [DescribeTaskStatus](https://cloud.tencent.com/document/product/214/30683) 接口查询本次任务是否成功。
<br/>限制说明：

- 仅广州、深圳金融、上海、上海金融、北京、成都、中国香港、新加坡、孟买、东京、硅谷地域支持绑定 SCF。
- 仅标准账户类型支持绑定 SCF，传统账户类型不支持。建议升级为标准账户类型，详情可参见 [账户类型升级说明](https://cloud.tencent.com/document/product/1199/49090)。
- 传统型负载均衡不支持绑定 SCF。
- 基础网络类型不支持绑定 SCF。
- CLB 默认支持绑定同地域下的所有 SCF，可支持跨 VPC 绑定 SCF，不支持跨地域绑定。
- 目前仅 IPv4、IPv6 NAT64 版本的负载均衡支持绑定 SCF，IPv6 版本的暂不支持。
- 仅七层（HTTP、HTTPS）监听器支持绑定 SCF，四层（TCP、UDP、TCP SSL）监听器和七层 QUIC 监听器不支持。
- CLB 绑定 SCF 仅支持绑定“Event 函数”类型的云函数。
     * @param req DeregisterFunctionTargetsRequest
     * @return DeregisterFunctionTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterFunctionTargetsResponse DeregisterFunctionTargets(DeregisterFunctionTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeregisterFunctionTargets", DeregisterFunctionTargetsResponse.class);
    }

    /**
     *从目标组中解绑服务器。
本接口为异步接口，本接口返回成功后需以返回的 RequestID 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
     * @param req DeregisterTargetGroupInstancesRequest
     * @return DeregisterTargetGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterTargetGroupInstancesResponse DeregisterTargetGroupInstances(DeregisterTargetGroupInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeregisterTargetGroupInstances", DeregisterTargetGroupInstancesResponse.class);
    }

    /**
     *DeregisterTargets 接口用来将一台或多台后端服务从负载均衡的监听器或转发规则上解绑，对于四层监听器，只需指定监听器ID即可，对于七层监听器，还需通过LocationId或Domain+Url指定转发规则。
本接口为异步接口，本接口返回成功后需以返回的RequestID为入参，调用DescribeTaskStatus接口查询本次任务是否成功。
     * @param req DeregisterTargetsRequest
     * @return DeregisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterTargetsResponse DeregisterTargets(DeregisterTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeregisterTargets", DeregisterTargetsResponse.class);
    }

    /**
     *DeregisterTargetsFromClassicalLB 接口用于解绑负载均衡后端服务。本接口为异步接口，接口返回成功后，需以返回的 RequestId 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
     * @param req DeregisterTargetsFromClassicalLBRequest
     * @return DeregisterTargetsFromClassicalLBResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterTargetsFromClassicalLBResponse DeregisterTargetsFromClassicalLB(DeregisterTargetsFromClassicalLBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeregisterTargetsFromClassicalLB", DeregisterTargetsFromClassicalLBResponse.class);
    }

    /**
     *查询一个负载均衡所封禁的IP列表（黑名单）。（接口灰度中，如需使用请提工单）
     * @param req DescribeBlockIPListRequest
     * @return DescribeBlockIPListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlockIPListResponse DescribeBlockIPList(DescribeBlockIPListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlockIPList", DescribeBlockIPListResponse.class);
    }

    /**
     *根据 ModifyBlockIPList 接口返回的异步任务的ID，查询封禁IP（黑名单）异步任务的执行状态。（接口灰度中，如需使用请提工单）
     * @param req DescribeBlockIPTaskRequest
     * @return DescribeBlockIPTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlockIPTaskResponse DescribeBlockIPTask(DescribeBlockIPTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlockIPTask", DescribeBlockIPTaskResponse.class);
    }

    /**
     *DescribeClassicalLBByInstanceId用于通过后端实例ID获取传统型负载均衡ID列表。
     * @param req DescribeClassicalLBByInstanceIdRequest
     * @return DescribeClassicalLBByInstanceIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicalLBByInstanceIdResponse DescribeClassicalLBByInstanceId(DescribeClassicalLBByInstanceIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClassicalLBByInstanceId", DescribeClassicalLBByInstanceIdResponse.class);
    }

    /**
     *DescribeClassicalLBHealthStatus用于获取传统型负载均衡后端的健康状态
     * @param req DescribeClassicalLBHealthStatusRequest
     * @return DescribeClassicalLBHealthStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicalLBHealthStatusResponse DescribeClassicalLBHealthStatus(DescribeClassicalLBHealthStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClassicalLBHealthStatus", DescribeClassicalLBHealthStatusResponse.class);
    }

    /**
     *DescribeClassicalLBListeners 接口用于获取传统型负载均衡的监听器信息。
     * @param req DescribeClassicalLBListenersRequest
     * @return DescribeClassicalLBListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicalLBListenersResponse DescribeClassicalLBListeners(DescribeClassicalLBListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClassicalLBListeners", DescribeClassicalLBListenersResponse.class);
    }

    /**
     *DescribeClassicalLBTargets用于获取传统型负载均衡绑定的后端服务。
     * @param req DescribeClassicalLBTargetsRequest
     * @return DescribeClassicalLBTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicalLBTargetsResponse DescribeClassicalLBTargets(DescribeClassicalLBTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClassicalLBTargets", DescribeClassicalLBTargetsResponse.class);
    }

    /**
     *获取用户的CLB专有日志集。
     * @param req DescribeClsLogSetRequest
     * @return DescribeClsLogSetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClsLogSetResponse DescribeClsLogSet(DescribeClsLogSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClsLogSet", DescribeClsLogSetResponse.class);
    }

    /**
     *查询独占集群中的资源列表，支持按集群ID、VIP、负载均衡ID、是否闲置为过滤条件检索。
     * @param req DescribeClusterResourcesRequest
     * @return DescribeClusterResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterResourcesResponse DescribeClusterResources(DescribeClusterResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterResources", DescribeClusterResourcesResponse.class);
    }

    /**
     *查询跨域2.0版本云联网后端子机和网卡信息。
     * @param req DescribeCrossTargetsRequest
     * @return DescribeCrossTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossTargetsResponse DescribeCrossTargets(DescribeCrossTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCrossTargets", DescribeCrossTargetsResponse.class);
    }

    /**
     *拉取配置绑定的 server 或 location，如果 domain 存在，结果将根据 domain 过滤。或拉取配置绑定的 loadbalancer。
     * @param req DescribeCustomizedConfigAssociateListRequest
     * @return DescribeCustomizedConfigAssociateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomizedConfigAssociateListResponse DescribeCustomizedConfigAssociateList(DescribeCustomizedConfigAssociateListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomizedConfigAssociateList", DescribeCustomizedConfigAssociateListResponse.class);
    }

    /**
     *拉取个性化配置列表，返回用户 AppId 下指定类型的配置。
     * @param req DescribeCustomizedConfigListRequest
     * @return DescribeCustomizedConfigListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomizedConfigListResponse DescribeCustomizedConfigList(DescribeCustomizedConfigListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomizedConfigList", DescribeCustomizedConfigListResponse.class);
    }

    /**
     *查询集群信息列表，支持以集群类型、集群唯一ID、集群名字、集群标签、集群内vip、集群内负载均衡唯一id、集群网络类型、可用区等条件进行检索
     * @param req DescribeExclusiveClustersRequest
     * @return DescribeExclusiveClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExclusiveClustersResponse DescribeExclusiveClusters(DescribeExclusiveClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExclusiveClusters", DescribeExclusiveClustersResponse.class);
    }

    /**
     *闲置实例是指创建超过7天后付费实例，且没有创建规则或创建规则没有绑定子机的负载均衡实例。
     * @param req DescribeIdleLoadBalancersRequest
     * @return DescribeIdleLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdleLoadBalancersResponse DescribeIdleLoadBalancers(DescribeIdleLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIdleLoadBalancers", DescribeIdleLoadBalancersResponse.class);
    }

    /**
     *查询后端云主机或弹性网卡绑定的负载均衡，支持弹性网卡和cvm查询。
     * @param req DescribeLBListenersRequest
     * @return DescribeLBListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLBListenersResponse DescribeLBListeners(DescribeLBListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLBListeners", DescribeLBListenersResponse.class);
    }

    /**
     *DescribeListeners 接口可根据负载均衡器 ID、监听器的协议或端口作为过滤条件获取监听器列表。如果不指定任何过滤条件，则返回该负载均衡实例下的所有监听器。
     * @param req DescribeListenersRequest
     * @return DescribeListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenersResponse DescribeListeners(DescribeListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListeners", DescribeListenersResponse.class);
    }

    /**
     *根据证书ID查询其在一个地域中所关联到负载均衡实例列表
     * @param req DescribeLoadBalancerListByCertIdRequest
     * @return DescribeLoadBalancerListByCertIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerListByCertIdResponse DescribeLoadBalancerListByCertId(DescribeLoadBalancerListByCertIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancerListByCertId", DescribeLoadBalancerListByCertIdResponse.class);
    }

    /**
     *查询运行中、隔离中、即将到期和负载均衡总数。
     * @param req DescribeLoadBalancerOverviewRequest
     * @return DescribeLoadBalancerOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerOverviewResponse DescribeLoadBalancerOverview(DescribeLoadBalancerOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancerOverview", DescribeLoadBalancerOverviewResponse.class);
    }

    /**
     *查询账号下的高流量负载均衡，返回前10个负载均衡。如果是子账号登录，只返回子账号有权限的负载均衡。
     * @param req DescribeLoadBalancerTrafficRequest
     * @return DescribeLoadBalancerTrafficResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerTrafficResponse DescribeLoadBalancerTraffic(DescribeLoadBalancerTrafficRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancerTraffic", DescribeLoadBalancerTrafficResponse.class);
    }

    /**
     *查询一个地域的负载均衡实例列表。
     * @param req DescribeLoadBalancersRequest
     * @return DescribeLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancersResponse DescribeLoadBalancers(DescribeLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancers", DescribeLoadBalancersResponse.class);
    }

    /**
     *查询负载均衡的详细信息，包括监听器，规则及后端目标。
     * @param req DescribeLoadBalancersDetailRequest
     * @return DescribeLoadBalancersDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancersDetailResponse DescribeLoadBalancersDetail(DescribeLoadBalancersDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancersDetail", DescribeLoadBalancersDetailResponse.class);
    }

    /**
     *查询用户当前地域下的各项配额
     * @param req DescribeQuotaRequest
     * @return DescribeQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuotaResponse DescribeQuota(DescribeQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQuota", DescribeQuotaResponse.class);
    }

    /**
     *查询用户在当前地域支持可用区列表和资源列表。
     * @param req DescribeResourcesRequest
     * @return DescribeResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesResponse DescribeResources(DescribeResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResources", DescribeResourcesResponse.class);
    }

    /**
     *DescribeRewrite 接口可根据负载均衡实例ID，查询一个负载均衡实例下转发规则的重定向关系。如果不指定监听器ID或转发规则ID，则返回该负载均衡实例下的所有重定向关系。
     * @param req DescribeRewriteRequest
     * @return DescribeRewriteResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRewriteResponse DescribeRewrite(DescribeRewriteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRewrite", DescribeRewriteResponse.class);
    }

    /**
     *获取目标组绑定的服务器信息
     * @param req DescribeTargetGroupInstancesRequest
     * @return DescribeTargetGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupInstancesResponse DescribeTargetGroupInstances(DescribeTargetGroupInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroupInstances", DescribeTargetGroupInstancesResponse.class);
    }

    /**
     *获取目标组列表
     * @param req DescribeTargetGroupListRequest
     * @return DescribeTargetGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupListResponse DescribeTargetGroupList(DescribeTargetGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroupList", DescribeTargetGroupListResponse.class);
    }

    /**
     *查询目标组信息
     * @param req DescribeTargetGroupsRequest
     * @return DescribeTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupsResponse DescribeTargetGroups(DescribeTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroups", DescribeTargetGroupsResponse.class);
    }

    /**
     *DescribeTargetHealth 接口用来获取负载均衡后端服务的健康检查结果，不支持传统型负载均衡。
     * @param req DescribeTargetHealthRequest
     * @return DescribeTargetHealthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetHealthResponse DescribeTargetHealth(DescribeTargetHealthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetHealth", DescribeTargetHealthResponse.class);
    }

    /**
     *DescribeTargets 接口用来查询负载均衡实例的某些监听器绑定的后端服务列表。
     * @param req DescribeTargetsRequest
     * @return DescribeTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetsResponse DescribeTargets(DescribeTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargets", DescribeTargetsResponse.class);
    }

    /**
     *本接口用于查询异步任务的执行状态，对于非查询类的接口（创建/删除负载均衡实例、监听器、规则以及绑定或解绑后端服务等），在接口调用成功后，都需要使用本接口查询任务最终是否执行成功。
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskStatus", DescribeTaskStatusResponse.class);
    }

    /**
     *解除规则的目标组关联关系。
本接口为异步接口，本接口返回成功后需以返回的 RequestID 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
     * @param req DisassociateTargetGroupsRequest
     * @return DisassociateTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateTargetGroupsResponse DisassociateTargetGroups(DisassociateTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateTargetGroups", DisassociateTargetGroupsResponse.class);
    }

    /**
     *InquiryPriceCreateLoadBalancer接口查询创建负载均衡的价格。
     * @param req InquiryPriceCreateLoadBalancerRequest
     * @return InquiryPriceCreateLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateLoadBalancerResponse InquiryPriceCreateLoadBalancer(InquiryPriceCreateLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceCreateLoadBalancer", InquiryPriceCreateLoadBalancerResponse.class);
    }

    /**
     *InquiryPriceModifyLoadBalancer接口修改负载均衡配置询价。
     * @param req InquiryPriceModifyLoadBalancerRequest
     * @return InquiryPriceModifyLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceModifyLoadBalancerResponse InquiryPriceModifyLoadBalancer(InquiryPriceModifyLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceModifyLoadBalancer", InquiryPriceModifyLoadBalancerResponse.class);
    }

    /**
     *InquiryPriceRefundLoadBalancer接口查询负载均衡退费价格。
     * @param req InquiryPriceRefundLoadBalancerRequest
     * @return InquiryPriceRefundLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRefundLoadBalancerResponse InquiryPriceRefundLoadBalancer(InquiryPriceRefundLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceRefundLoadBalancer", InquiryPriceRefundLoadBalancerResponse.class);
    }

    /**
     *InquiryPriceRenewLoadBalancer接口查询对负载均衡续费的价格，只支持预付费负载均衡续费。
     * @param req InquiryPriceRenewLoadBalancerRequest
     * @return InquiryPriceRenewLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewLoadBalancerResponse InquiryPriceRenewLoadBalancer(InquiryPriceRenewLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceRenewLoadBalancer", InquiryPriceRenewLoadBalancerResponse.class);
    }

    /**
     *用户手动配置原访问地址和重定向地址，系统自动将原访问地址的请求重定向至对应路径的目的地址。同一域名下可以配置多条路径作为重定向策略，实现http/https之间请求的自动跳转。设置重定向时，需满足如下约束条件：若A已经重定向至B，则A不能再重定向至C（除非先删除老的重定向关系，再建立新的重定向关系），B不能重定向至任何其它地址。
本接口为异步接口，本接口返回成功后需以返回的RequestID为入参，调用DescribeTaskStatus接口查询本次任务是否成功。
     * @param req ManualRewriteRequest
     * @return ManualRewriteResponse
     * @throws TencentCloudSDKException
     */
    public ManualRewriteResponse ManualRewrite(ManualRewriteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ManualRewrite", ManualRewriteResponse.class);
    }

    /**
     *本接口将传统型负载均衡迁移成(原应用型)负载均衡
本接口为异步接口，接口成功返回后，可使用 DescribeLoadBalancers 接口查询负载均衡实例的状态（如创建中、正常），以确定是否创建成功。
     * @param req MigrateClassicalLoadBalancersRequest
     * @return MigrateClassicalLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public MigrateClassicalLoadBalancersResponse MigrateClassicalLoadBalancers(MigrateClassicalLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MigrateClassicalLoadBalancers", MigrateClassicalLoadBalancersResponse.class);
    }

    /**
     *修改负载均衡的IP（client IP）封禁黑名单列表，一个转发规则最多支持封禁 2000000 个IP，及黑名单容量为 2000000。
（接口灰度中，如需使用请提工单）
     * @param req ModifyBlockIPListRequest
     * @return ModifyBlockIPListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlockIPListResponse ModifyBlockIPList(ModifyBlockIPListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBlockIPList", ModifyBlockIPListResponse.class);
    }

    /**
     *ModifyDomain接口用来修改负载均衡七层监听器下的域名。
本接口为异步接口，本接口返回成功后需以返回的RequestID为入参，调用DescribeTaskStatus接口查询本次任务是否成功。
     * @param req ModifyDomainRequest
     * @return ModifyDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainResponse ModifyDomain(ModifyDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomain", ModifyDomainResponse.class);
    }

    /**
     *ModifyDomainAttributes接口用于修改负载均衡7层监听器转发规则的域名级别属性，如修改域名、修改DefaultServer、开启/关闭Http2、修改证书。
本接口为异步接口，本接口返回成功后，需以返回的RequestId为入参，调用DescribeTaskStatus接口查询本次任务是否成功。
     * @param req ModifyDomainAttributesRequest
     * @return ModifyDomainAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainAttributesResponse ModifyDomainAttributes(ModifyDomainAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainAttributes", ModifyDomainAttributesResponse.class);
    }

    /**
     *修改负载均衡转发规则上所绑定的云函数。
     * @param req ModifyFunctionTargetsRequest
     * @return ModifyFunctionTargetsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFunctionTargetsResponse ModifyFunctionTargets(ModifyFunctionTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFunctionTargets", ModifyFunctionTargetsResponse.class);
    }

    /**
     *ModifyListener接口用来修改负载均衡监听器的属性，包括监听器名称、健康检查参数、证书信息、转发策略等。本接口不支持传统型负载均衡。
本接口为异步接口，本接口返回成功后需以返回的RequestID为入参，调用DescribeTaskStatus接口查询本次任务是否成功。
     * @param req ModifyListenerRequest
     * @return ModifyListenerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyListenerResponse ModifyListener(ModifyListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyListener", ModifyListenerResponse.class);
    }

    /**
     *修改负载均衡实例的属性。支持修改负载均衡实例的名称、设置负载均衡的跨域属性。
注意：非带宽上移用户的 CLB 实例必须加入带宽包才可以设置跨域属性。
本接口为异步接口，接口返回成功后，需以得到的 RequestID 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
     * @param req ModifyLoadBalancerAttributesRequest
     * @return ModifyLoadBalancerAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerAttributesResponse ModifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerAttributes", ModifyLoadBalancerAttributesResponse.class);
    }

    /**
     *修改IPv6FullChain负载均衡7层监听器支持混绑IPv4/IPv6目标特性。
     * @param req ModifyLoadBalancerMixIpTargetRequest
     * @return ModifyLoadBalancerMixIpTargetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerMixIpTargetResponse ModifyLoadBalancerMixIpTarget(ModifyLoadBalancerMixIpTargetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerMixIpTarget", ModifyLoadBalancerMixIpTargetResponse.class);
    }

    /**
     *本接口（ModifyLoadBalancerSla）用于将按量计费模式的共享型实例升级为性能容量型实例。<br/>
限制条件：
- 本接口只支持升级按量计费的CLB实例，包年包月的CLB实例升级请通过控制台进行升级。
- 升级为性能容量型实例后，不支持再回退到共享型实例。
- 传统型负载均衡实例不支持升级为性能容量型实例。
     * @param req ModifyLoadBalancerSlaRequest
     * @return ModifyLoadBalancerSlaResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerSlaResponse ModifyLoadBalancerSla(ModifyLoadBalancerSlaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerSla", ModifyLoadBalancerSlaResponse.class);
    }

    /**
     *修改一个或多个负载均衡实例所属项目。
     * @param req ModifyLoadBalancersProjectRequest
     * @return ModifyLoadBalancersProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancersProjectResponse ModifyLoadBalancersProject(ModifyLoadBalancersProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancersProject", ModifyLoadBalancersProjectResponse.class);
    }

    /**
     *ModifyRule 接口用来修改负载均衡七层监听器下的转发规则的各项属性，包括转发路径、健康检查属性、转发策略等。
本接口为异步接口，本接口返回成功后需以返回的RequestID为入参，调用DescribeTaskStatus接口查询本次任务是否成功。
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRule", ModifyRuleResponse.class);
    }

    /**
     *修改目标组的名称或者默认端口属性
     * @param req ModifyTargetGroupAttributeRequest
     * @return ModifyTargetGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetGroupAttributeResponse ModifyTargetGroupAttribute(ModifyTargetGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetGroupAttribute", ModifyTargetGroupAttributeResponse.class);
    }

    /**
     *批量修改目标组服务器端口。
本接口为异步接口，本接口返回成功后需以返回的 RequestID 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
     * @param req ModifyTargetGroupInstancesPortRequest
     * @return ModifyTargetGroupInstancesPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetGroupInstancesPortResponse ModifyTargetGroupInstancesPort(ModifyTargetGroupInstancesPortRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetGroupInstancesPort", ModifyTargetGroupInstancesPortResponse.class);
    }

    /**
     *批量修改目标组的服务器权重。
本接口为异步接口，本接口返回成功后需以返回的 RequestID 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
     * @param req ModifyTargetGroupInstancesWeightRequest
     * @return ModifyTargetGroupInstancesWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetGroupInstancesWeightResponse ModifyTargetGroupInstancesWeight(ModifyTargetGroupInstancesWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetGroupInstancesWeight", ModifyTargetGroupInstancesWeightResponse.class);
    }

    /**
     *ModifyTargetPort接口用于修改监听器绑定的后端服务的端口。
本接口为异步接口，本接口返回成功后需以返回的RequestID为入参，调用DescribeTaskStatus接口查询本次任务是否成功。
     * @param req ModifyTargetPortRequest
     * @return ModifyTargetPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetPortResponse ModifyTargetPort(ModifyTargetPortRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetPort", ModifyTargetPortResponse.class);
    }

    /**
     *ModifyTargetWeight 接口用于修改负载均衡绑定的后端服务的转发权重。
本接口为异步接口，本接口返回成功后需以返回的RequestID为入参，调用DescribeTaskStatus接口查询本次任务是否成功。
     * @param req ModifyTargetWeightRequest
     * @return ModifyTargetWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetWeightResponse ModifyTargetWeight(ModifyTargetWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetWeight", ModifyTargetWeightResponse.class);
    }

    /**
     *RegisterFunctionTargets 接口用来将一个云函数绑定到负载均衡的7层转发规则，在此之前您需要先行创建相关的7层监听器（HTTP、HTTPS）和转发规则。
本接口为异步接口，本接口返回成功后需以返回的RequestID为入参，调用DescribeTaskStatus接口查询本次任务是否成功。<br/>
限制说明：
- 仅广州、深圳金融、上海、上海金融、北京、成都、中国香港、新加坡、孟买、东京、硅谷地域支持绑定 SCF。
- 仅标准账户类型支持绑定 SCF，传统账户类型不支持。建议升级为标准账户类型，详情可参见 [账户类型升级说明](https://cloud.tencent.com/document/product/1199/49090)。 
- 传统型负载均衡不支持绑定 SCF。
- 基础网络类型不支持绑定 SCF。
- CLB 默认支持绑定同地域下的所有 SCF，可支持跨 VPC 绑定 SCF，不支持跨地域绑定。
- 目前仅 IPv4、IPv6 NAT64 版本的负载均衡支持绑定 SCF，IPv6 版本的暂不支持。
- 仅七层（HTTP、HTTPS）监听器支持绑定 SCF，四层（TCP、UDP、TCP SSL）监听器和七层 QUIC 监听器不支持。
- CLB 绑定 SCF 仅支持绑定“Event 函数”类型的云函数。
     * @param req RegisterFunctionTargetsRequest
     * @return RegisterFunctionTargetsResponse
     * @throws TencentCloudSDKException
     */
    public RegisterFunctionTargetsResponse RegisterFunctionTargets(RegisterFunctionTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterFunctionTargets", RegisterFunctionTargetsResponse.class);
    }

    /**
     *注册服务器到目标组。
本接口为异步接口，本接口返回成功后需以返回的 RequestID 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
     * @param req RegisterTargetGroupInstancesRequest
     * @return RegisterTargetGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RegisterTargetGroupInstancesResponse RegisterTargetGroupInstances(RegisterTargetGroupInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterTargetGroupInstances", RegisterTargetGroupInstancesResponse.class);
    }

    /**
     *RegisterTargets 接口用来将一台或多台后端服务绑定到负载均衡的监听器（或7层转发规则），在此之前您需要先行创建相关的4层监听器或7层转发规则。对于四层监听器（TCP、UDP），只需指定监听器ID即可，对于七层监听器（HTTP、HTTPS），还需通过LocationId或者Domain+Url指定转发规则。
本接口为异步接口，本接口返回成功后需以返回的RequestID为入参，调用DescribeTaskStatus接口查询本次任务是否成功。
     * @param req RegisterTargetsRequest
     * @return RegisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public RegisterTargetsResponse RegisterTargets(RegisterTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterTargets", RegisterTargetsResponse.class);
    }

    /**
     *RegisterTargetsWithClassicalLB 接口用于绑定后端服务到传统型负载均衡。本接口为异步接口，接口返回成功后，需以返回的 RequestId 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
     * @param req RegisterTargetsWithClassicalLBRequest
     * @return RegisterTargetsWithClassicalLBResponse
     * @throws TencentCloudSDKException
     */
    public RegisterTargetsWithClassicalLBResponse RegisterTargetsWithClassicalLB(RegisterTargetsWithClassicalLBRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterTargetsWithClassicalLB", RegisterTargetsWithClassicalLBResponse.class);
    }

    /**
     *ReplaceCertForLoadBalancers 接口用以替换负载均衡实例所关联的证书，对于各个地域的负载均衡，如果指定的老的证书ID与其有关联关系，则会先解除关联，再建立新证书与该负载均衡的关联关系。
此接口支持替换服务端证书或客户端证书。
需要使用的新证书，可以通过传入证书ID来指定，如果不指定证书ID，则必须传入证书内容等相关信息，用以新建证书并绑定至负载均衡。
注：本接口仅可从广州地域调用。
     * @param req ReplaceCertForLoadBalancersRequest
     * @return ReplaceCertForLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceCertForLoadBalancersResponse ReplaceCertForLoadBalancers(ReplaceCertForLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceCertForLoadBalancers", ReplaceCertForLoadBalancersResponse.class);
    }

    /**
     *负载均衡维度的个性化配置相关操作：创建、删除、修改、绑定、解绑
     * @param req SetCustomizedConfigForLoadBalancerRequest
     * @return SetCustomizedConfigForLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public SetCustomizedConfigForLoadBalancerResponse SetCustomizedConfigForLoadBalancer(SetCustomizedConfigForLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetCustomizedConfigForLoadBalancer", SetCustomizedConfigForLoadBalancerResponse.class);
    }

    /**
     *增加、删除、更新负载均衡的日志服务(CLS)主题。
     * @param req SetLoadBalancerClsLogRequest
     * @return SetLoadBalancerClsLogResponse
     * @throws TencentCloudSDKException
     */
    public SetLoadBalancerClsLogResponse SetLoadBalancerClsLog(SetLoadBalancerClsLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLoadBalancerClsLog", SetLoadBalancerClsLogResponse.class);
    }

    /**
     *SetLoadBalancerSecurityGroups 接口支持对一个公网负载均衡实例执行设置（绑定、解绑）安全组操作。查询一个负载均衡实例目前已绑定的安全组，可使用 DescribeLoadBalancers 接口。本接口是set语义，
绑定操作时，入参需要传入负载均衡实例要绑定的所有安全组（已绑定的+新增绑定的）。
解绑操作时，入参需要传入负载均衡实例执行解绑后所绑定的所有安全组；如果要解绑所有安全组，可不传此参数，或传入空数组。注意：内网 CLB 绑定 EIP 后，CLB 上的安全组对来自 EIP 的流量不生效，对来自内网 CLB 的流量生效。
     * @param req SetLoadBalancerSecurityGroupsRequest
     * @return SetLoadBalancerSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public SetLoadBalancerSecurityGroupsResponse SetLoadBalancerSecurityGroups(SetLoadBalancerSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLoadBalancerSecurityGroups", SetLoadBalancerSecurityGroupsResponse.class);
    }

    /**
     *启停负载均衡实例或者监听器。
本接口为异步接口，接口返回成功后，需以得到的 RequestID 为入参，调用 DescribeTaskStatus 接口查询本次任务是否成功。
该功能正在内测中，如需使用，请通过[工单申请](https://console.cloud.tencent.com/workorder/category?level1_id=6&level2_id=163&source=0&data_title=%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%20LB&step=1)。
     * @param req SetLoadBalancerStartStatusRequest
     * @return SetLoadBalancerStartStatusResponse
     * @throws TencentCloudSDKException
     */
    public SetLoadBalancerStartStatusResponse SetLoadBalancerStartStatus(SetLoadBalancerStartStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLoadBalancerStartStatus", SetLoadBalancerStartStatusResponse.class);
    }

    /**
     *绑定或解绑一个安全组到多个公网负载均衡实例。注意：内网负载均衡不支持绑定安全组。
     * @param req SetSecurityGroupForLoadbalancersRequest
     * @return SetSecurityGroupForLoadbalancersResponse
     * @throws TencentCloudSDKException
     */
    public SetSecurityGroupForLoadbalancersResponse SetSecurityGroupForLoadbalancers(SetSecurityGroupForLoadbalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetSecurityGroupForLoadbalancers", SetSecurityGroupForLoadbalancersResponse.class);
    }

}
