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

public class GenerateRegisterCommandRequest extends AbstractModel {

    /**
    * <p>IDC集群ID，形如<code>hpc-xxxxxxxx</code>。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>是否通过内网专线代理连接。</p><li>true：IDC机器需经PrivateLink代理接入</li><li>false：IDC机器可直连（默认值）</li><p></p>
    */
    @SerializedName("Proxy")
    @Expose
    private Boolean Proxy;

    /**
    * <p>私有网络ID，形如<code>vpc-xxx</code>。仅当<code>Proxy=true</code>且集群未绑定VPC时必填。与SubnetId需同时指定或同时不指定。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络子网ID，形如<code>subnet-xxx</code>。仅当<code>Proxy=true</code>且集群未绑定VPC时必填。与VpcId需同时指定或同时不指定。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>注册码绑定的队列名称。不指定时由系统取集群默认队列。</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>注册码有效期，单位：秒。默认值为604800（7天）。</p>
    */
    @SerializedName("ExpireSeconds")
    @Expose
    private Long ExpireSeconds;

    /**
     * Get <p>IDC集群ID，形如<code>hpc-xxxxxxxx</code>。</p> 
     * @return ClusterId <p>IDC集群ID，形如<code>hpc-xxxxxxxx</code>。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>IDC集群ID，形如<code>hpc-xxxxxxxx</code>。</p>
     * @param ClusterId <p>IDC集群ID，形如<code>hpc-xxxxxxxx</code>。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>是否通过内网专线代理连接。</p><li>true：IDC机器需经PrivateLink代理接入</li><li>false：IDC机器可直连（默认值）</li><p></p> 
     * @return Proxy <p>是否通过内网专线代理连接。</p><li>true：IDC机器需经PrivateLink代理接入</li><li>false：IDC机器可直连（默认值）</li><p></p>
     */
    public Boolean getProxy() {
        return this.Proxy;
    }

    /**
     * Set <p>是否通过内网专线代理连接。</p><li>true：IDC机器需经PrivateLink代理接入</li><li>false：IDC机器可直连（默认值）</li><p></p>
     * @param Proxy <p>是否通过内网专线代理连接。</p><li>true：IDC机器需经PrivateLink代理接入</li><li>false：IDC机器可直连（默认值）</li><p></p>
     */
    public void setProxy(Boolean Proxy) {
        this.Proxy = Proxy;
    }

    /**
     * Get <p>私有网络ID，形如<code>vpc-xxx</code>。仅当<code>Proxy=true</code>且集群未绑定VPC时必填。与SubnetId需同时指定或同时不指定。</p> 
     * @return VpcId <p>私有网络ID，形如<code>vpc-xxx</code>。仅当<code>Proxy=true</code>且集群未绑定VPC时必填。与SubnetId需同时指定或同时不指定。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID，形如<code>vpc-xxx</code>。仅当<code>Proxy=true</code>且集群未绑定VPC时必填。与SubnetId需同时指定或同时不指定。</p>
     * @param VpcId <p>私有网络ID，形如<code>vpc-xxx</code>。仅当<code>Proxy=true</code>且集群未绑定VPC时必填。与SubnetId需同时指定或同时不指定。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络子网ID，形如<code>subnet-xxx</code>。仅当<code>Proxy=true</code>且集群未绑定VPC时必填。与VpcId需同时指定或同时不指定。</p> 
     * @return SubnetId <p>私有网络子网ID，形如<code>subnet-xxx</code>。仅当<code>Proxy=true</code>且集群未绑定VPC时必填。与VpcId需同时指定或同时不指定。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>私有网络子网ID，形如<code>subnet-xxx</code>。仅当<code>Proxy=true</code>且集群未绑定VPC时必填。与VpcId需同时指定或同时不指定。</p>
     * @param SubnetId <p>私有网络子网ID，形如<code>subnet-xxx</code>。仅当<code>Proxy=true</code>且集群未绑定VPC时必填。与VpcId需同时指定或同时不指定。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>注册码绑定的队列名称。不指定时由系统取集群默认队列。</p> 
     * @return QueueName <p>注册码绑定的队列名称。不指定时由系统取集群默认队列。</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>注册码绑定的队列名称。不指定时由系统取集群默认队列。</p>
     * @param QueueName <p>注册码绑定的队列名称。不指定时由系统取集群默认队列。</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>注册码有效期，单位：秒。默认值为604800（7天）。</p> 
     * @return ExpireSeconds <p>注册码有效期，单位：秒。默认值为604800（7天）。</p>
     */
    public Long getExpireSeconds() {
        return this.ExpireSeconds;
    }

    /**
     * Set <p>注册码有效期，单位：秒。默认值为604800（7天）。</p>
     * @param ExpireSeconds <p>注册码有效期，单位：秒。默认值为604800（7天）。</p>
     */
    public void setExpireSeconds(Long ExpireSeconds) {
        this.ExpireSeconds = ExpireSeconds;
    }

    public GenerateRegisterCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateRegisterCommandRequest(GenerateRegisterCommandRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Proxy != null) {
            this.Proxy = new Boolean(source.Proxy);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.ExpireSeconds != null) {
            this.ExpireSeconds = new Long(source.ExpireSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Proxy", this.Proxy);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "ExpireSeconds", this.ExpireSeconds);

    }
}

