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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InitializeCloudRunResourceRequest extends AbstractModel {

    /**
    * <p>tcbr,run,weda,baas</p>
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * <p>环境ID 云开发平台必填</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>私有网络Id</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网列表</p>
    */
    @SerializedName("SubNetIds")
    @Expose
    private String [] SubNetIds;

    /**
    * <p>来源：wechat | cloud | weda</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>渠道：wechat | cloud | weda</p>
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
     * Get <p>tcbr,run,weda,baas</p> 
     * @return EnvType <p>tcbr,run,weda,baas</p>
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set <p>tcbr,run,weda,baas</p>
     * @param EnvType <p>tcbr,run,weda,baas</p>
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get <p>环境ID 云开发平台必填</p> 
     * @return EnvId <p>环境ID 云开发平台必填</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID 云开发平台必填</p>
     * @param EnvId <p>环境ID 云开发平台必填</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>私有网络Id</p> 
     * @return VpcId <p>私有网络Id</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络Id</p>
     * @param VpcId <p>私有网络Id</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网列表</p> 
     * @return SubNetIds <p>子网列表</p>
     */
    public String [] getSubNetIds() {
        return this.SubNetIds;
    }

    /**
     * Set <p>子网列表</p>
     * @param SubNetIds <p>子网列表</p>
     */
    public void setSubNetIds(String [] SubNetIds) {
        this.SubNetIds = SubNetIds;
    }

    /**
     * Get <p>来源：wechat | cloud | weda</p> 
     * @return Source <p>来源：wechat | cloud | weda</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>来源：wechat | cloud | weda</p>
     * @param Source <p>来源：wechat | cloud | weda</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>渠道：wechat | cloud | weda</p> 
     * @return Channel <p>渠道：wechat | cloud | weda</p>
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>渠道：wechat | cloud | weda</p>
     * @param Channel <p>渠道：wechat | cloud | weda</p>
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    public InitializeCloudRunResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InitializeCloudRunResourceRequest(InitializeCloudRunResourceRequest source) {
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubNetIds != null) {
            this.SubNetIds = new String[source.SubNetIds.length];
            for (int i = 0; i < source.SubNetIds.length; i++) {
                this.SubNetIds[i] = new String(source.SubNetIds[i]);
            }
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubNetIds.", this.SubNetIds);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Channel", this.Channel);

    }
}

