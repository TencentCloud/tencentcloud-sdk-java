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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIngressesRequest extends AbstractModel{

    /**
    * namespace id
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * namespace
    */
    @SerializedName("EksNamespace")
    @Expose
    private String EksNamespace;

    /**
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
     * Get namespace id 
     * @return NamespaceId namespace id
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set namespace id
     * @param NamespaceId namespace id
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get namespace 
     * @return EksNamespace namespace
     */
    public String getEksNamespace() {
        return this.EksNamespace;
    }

    /**
     * Set namespace
     * @param EksNamespace namespace
     */
    public void setEksNamespace(String EksNamespace) {
        this.EksNamespace = EksNamespace;
    }

    /**
     * Get 来源渠道 
     * @return SourceChannel 来源渠道
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源渠道
     * @param SourceChannel 来源渠道
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    public DescribeIngressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIngressesRequest(DescribeIngressesRequest source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.EksNamespace != null) {
            this.EksNamespace = new String(source.EksNamespace);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "EksNamespace", this.EksNamespace);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);

    }
}

