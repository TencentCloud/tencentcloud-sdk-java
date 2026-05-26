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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHostRequest extends AbstractModel {

    /**
    * <p>防护域名配置信息。内网负载均衡器必须携带对应的NumericalVpcId。</p>
    */
    @SerializedName("Host")
    @Expose
    private HostRecord Host;

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get <p>防护域名配置信息。内网负载均衡器必须携带对应的NumericalVpcId。</p> 
     * @return Host <p>防护域名配置信息。内网负载均衡器必须携带对应的NumericalVpcId。</p>
     */
    public HostRecord getHost() {
        return this.Host;
    }

    /**
     * Set <p>防护域名配置信息。内网负载均衡器必须携带对应的NumericalVpcId。</p>
     * @param Host <p>防护域名配置信息。内网负载均衡器必须携带对应的NumericalVpcId。</p>
     */
    public void setHost(HostRecord Host) {
        this.Host = Host;
    }

    /**
     * Get <p>实例id</p> 
     * @return InstanceID <p>实例id</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceID <p>实例id</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>标签信息</p> 
     * @return Tags <p>标签信息</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息</p>
     * @param Tags <p>标签信息</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public CreateHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHostRequest(CreateHostRequest source) {
        if (source.Host != null) {
            this.Host = new HostRecord(source.Host);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Host.", this.Host);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

