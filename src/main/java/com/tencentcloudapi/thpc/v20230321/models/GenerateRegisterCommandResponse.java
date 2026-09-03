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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateRegisterCommandResponse extends AbstractModel {

    /**
    * <p>渲染好的节点注册命令，可直接在IDC机器上以root身份执行。</p>
    */
    @SerializedName("RegisterCommand")
    @Expose
    private String RegisterCommand;

    /**
    * <p>节点注册码。作为不透明凭证使用，请妥善保管，仅在节点注册纳管时传入。</p>
    */
    @SerializedName("RegisterCode")
    @Expose
    private String RegisterCode;

    /**
    * <p>注册码到期的Unix时间戳，单位：秒。</p>
    */
    @SerializedName("ExpireAt")
    @Expose
    private Long ExpireAt;

    /**
    * <p>回显本次是否走内网专线代理。</p>
    */
    @SerializedName("Proxy")
    @Expose
    private Boolean Proxy;

    /**
    * <p>代理终端节点VIP地址。当<code>Proxy=true</code>且终端节点就绪时非空。</p>
    */
    @SerializedName("EndPointVip")
    @Expose
    private String EndPointVip;

    /**
    * <p>终端节点状态。取值范围：</p><li>ACTIVE：已激活</li><li>BINDCHANGE：变更中</li><li>BINDINGCREATE：创建中</li><li>BINDINGDELETE：删除中</li><p></p>
    */
    @SerializedName("EndPointStatus")
    @Expose
    private String EndPointStatus;

    /**
    * <p>回显集群ID。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>渲染好的节点注册命令，可直接在IDC机器上以root身份执行。</p> 
     * @return RegisterCommand <p>渲染好的节点注册命令，可直接在IDC机器上以root身份执行。</p>
     */
    public String getRegisterCommand() {
        return this.RegisterCommand;
    }

    /**
     * Set <p>渲染好的节点注册命令，可直接在IDC机器上以root身份执行。</p>
     * @param RegisterCommand <p>渲染好的节点注册命令，可直接在IDC机器上以root身份执行。</p>
     */
    public void setRegisterCommand(String RegisterCommand) {
        this.RegisterCommand = RegisterCommand;
    }

    /**
     * Get <p>节点注册码。作为不透明凭证使用，请妥善保管，仅在节点注册纳管时传入。</p> 
     * @return RegisterCode <p>节点注册码。作为不透明凭证使用，请妥善保管，仅在节点注册纳管时传入。</p>
     */
    public String getRegisterCode() {
        return this.RegisterCode;
    }

    /**
     * Set <p>节点注册码。作为不透明凭证使用，请妥善保管，仅在节点注册纳管时传入。</p>
     * @param RegisterCode <p>节点注册码。作为不透明凭证使用，请妥善保管，仅在节点注册纳管时传入。</p>
     */
    public void setRegisterCode(String RegisterCode) {
        this.RegisterCode = RegisterCode;
    }

    /**
     * Get <p>注册码到期的Unix时间戳，单位：秒。</p> 
     * @return ExpireAt <p>注册码到期的Unix时间戳，单位：秒。</p>
     */
    public Long getExpireAt() {
        return this.ExpireAt;
    }

    /**
     * Set <p>注册码到期的Unix时间戳，单位：秒。</p>
     * @param ExpireAt <p>注册码到期的Unix时间戳，单位：秒。</p>
     */
    public void setExpireAt(Long ExpireAt) {
        this.ExpireAt = ExpireAt;
    }

    /**
     * Get <p>回显本次是否走内网专线代理。</p> 
     * @return Proxy <p>回显本次是否走内网专线代理。</p>
     */
    public Boolean getProxy() {
        return this.Proxy;
    }

    /**
     * Set <p>回显本次是否走内网专线代理。</p>
     * @param Proxy <p>回显本次是否走内网专线代理。</p>
     */
    public void setProxy(Boolean Proxy) {
        this.Proxy = Proxy;
    }

    /**
     * Get <p>代理终端节点VIP地址。当<code>Proxy=true</code>且终端节点就绪时非空。</p> 
     * @return EndPointVip <p>代理终端节点VIP地址。当<code>Proxy=true</code>且终端节点就绪时非空。</p>
     */
    public String getEndPointVip() {
        return this.EndPointVip;
    }

    /**
     * Set <p>代理终端节点VIP地址。当<code>Proxy=true</code>且终端节点就绪时非空。</p>
     * @param EndPointVip <p>代理终端节点VIP地址。当<code>Proxy=true</code>且终端节点就绪时非空。</p>
     */
    public void setEndPointVip(String EndPointVip) {
        this.EndPointVip = EndPointVip;
    }

    /**
     * Get <p>终端节点状态。取值范围：</p><li>ACTIVE：已激活</li><li>BINDCHANGE：变更中</li><li>BINDINGCREATE：创建中</li><li>BINDINGDELETE：删除中</li><p></p> 
     * @return EndPointStatus <p>终端节点状态。取值范围：</p><li>ACTIVE：已激活</li><li>BINDCHANGE：变更中</li><li>BINDINGCREATE：创建中</li><li>BINDINGDELETE：删除中</li><p></p>
     */
    public String getEndPointStatus() {
        return this.EndPointStatus;
    }

    /**
     * Set <p>终端节点状态。取值范围：</p><li>ACTIVE：已激活</li><li>BINDCHANGE：变更中</li><li>BINDINGCREATE：创建中</li><li>BINDINGDELETE：删除中</li><p></p>
     * @param EndPointStatus <p>终端节点状态。取值范围：</p><li>ACTIVE：已激活</li><li>BINDCHANGE：变更中</li><li>BINDINGCREATE：创建中</li><li>BINDINGDELETE：删除中</li><p></p>
     */
    public void setEndPointStatus(String EndPointStatus) {
        this.EndPointStatus = EndPointStatus;
    }

    /**
     * Get <p>回显集群ID。</p> 
     * @return ClusterId <p>回显集群ID。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>回显集群ID。</p>
     * @param ClusterId <p>回显集群ID。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GenerateRegisterCommandResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateRegisterCommandResponse(GenerateRegisterCommandResponse source) {
        if (source.RegisterCommand != null) {
            this.RegisterCommand = new String(source.RegisterCommand);
        }
        if (source.RegisterCode != null) {
            this.RegisterCode = new String(source.RegisterCode);
        }
        if (source.ExpireAt != null) {
            this.ExpireAt = new Long(source.ExpireAt);
        }
        if (source.Proxy != null) {
            this.Proxy = new Boolean(source.Proxy);
        }
        if (source.EndPointVip != null) {
            this.EndPointVip = new String(source.EndPointVip);
        }
        if (source.EndPointStatus != null) {
            this.EndPointStatus = new String(source.EndPointStatus);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegisterCommand", this.RegisterCommand);
        this.setParamSimple(map, prefix + "RegisterCode", this.RegisterCode);
        this.setParamSimple(map, prefix + "ExpireAt", this.ExpireAt);
        this.setParamSimple(map, prefix + "Proxy", this.Proxy);
        this.setParamSimple(map, prefix + "EndPointVip", this.EndPointVip);
        this.setParamSimple(map, prefix + "EndPointStatus", this.EndPointStatus);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

