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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpStatusRequest extends AbstractModel{

    /**
    * 加速域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 节点类型：
edge：表示边缘节点
last：表示回源层节点
不填充情况下，默认返回边缘节点信息
    */
    @SerializedName("Layer")
    @Expose
    private String Layer;

    /**
     * Get 加速域名 
     * @return Domain 加速域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 加速域名
     * @param Domain 加速域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 节点类型：
edge：表示边缘节点
last：表示回源层节点
不填充情况下，默认返回边缘节点信息 
     * @return Layer 节点类型：
edge：表示边缘节点
last：表示回源层节点
不填充情况下，默认返回边缘节点信息
     */
    public String getLayer() {
        return this.Layer;
    }

    /**
     * Set 节点类型：
edge：表示边缘节点
last：表示回源层节点
不填充情况下，默认返回边缘节点信息
     * @param Layer 节点类型：
edge：表示边缘节点
last：表示回源层节点
不填充情况下，默认返回边缘节点信息
     */
    public void setLayer(String Layer) {
        this.Layer = Layer;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Layer", this.Layer);

    }
}

