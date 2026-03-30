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

public class ImportIpAccessControlRequest extends AbstractModel {

    /**
    * 导入的IP黑白名单列表
    */
    @SerializedName("Data")
    @Expose
    private IpAccessControlParam [] Data;

    /**
    * 具体域名如：test.qcloudwaf.com
全局域名为：global
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 用于按数据来源导入黑白名单记录，必填。 custom（自定义），用户在控制台手动添加的黑白名单规则 cc（CC 防护	），由 CC 防护模块自动添加的 IP 黑白名单 bot（Bot 防护），由 Bot 防护模块自动添加的 IP 黑白名单 batch（批量域名防护），批量域名维度添加的黑白名单规则
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 导入的IP黑白名单列表 
     * @return Data 导入的IP黑白名单列表
     */
    public IpAccessControlParam [] getData() {
        return this.Data;
    }

    /**
     * Set 导入的IP黑白名单列表
     * @param Data 导入的IP黑白名单列表
     */
    public void setData(IpAccessControlParam [] Data) {
        this.Data = Data;
    }

    /**
     * Get 具体域名如：test.qcloudwaf.com
全局域名为：global 
     * @return Domain 具体域名如：test.qcloudwaf.com
全局域名为：global
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 具体域名如：test.qcloudwaf.com
全局域名为：global
     * @param Domain 具体域名如：test.qcloudwaf.com
全局域名为：global
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 用于按数据来源导入黑白名单记录，必填。 custom（自定义），用户在控制台手动添加的黑白名单规则 cc（CC 防护	），由 CC 防护模块自动添加的 IP 黑白名单 bot（Bot 防护），由 Bot 防护模块自动添加的 IP 黑白名单 batch（批量域名防护），批量域名维度添加的黑白名单规则 
     * @return SourceType 用于按数据来源导入黑白名单记录，必填。 custom（自定义），用户在控制台手动添加的黑白名单规则 cc（CC 防护	），由 CC 防护模块自动添加的 IP 黑白名单 bot（Bot 防护），由 Bot 防护模块自动添加的 IP 黑白名单 batch（批量域名防护），批量域名维度添加的黑白名单规则
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 用于按数据来源导入黑白名单记录，必填。 custom（自定义），用户在控制台手动添加的黑白名单规则 cc（CC 防护	），由 CC 防护模块自动添加的 IP 黑白名单 bot（Bot 防护），由 Bot 防护模块自动添加的 IP 黑白名单 batch（批量域名防护），批量域名维度添加的黑白名单规则
     * @param SourceType 用于按数据来源导入黑白名单记录，必填。 custom（自定义），用户在控制台手动添加的黑白名单规则 cc（CC 防护	），由 CC 防护模块自动添加的 IP 黑白名单 bot（Bot 防护），由 Bot 防护模块自动添加的 IP 黑白名单 batch（批量域名防护），批量域名维度添加的黑白名单规则
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ImportIpAccessControlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportIpAccessControlRequest(ImportIpAccessControlRequest source) {
        if (source.Data != null) {
            this.Data = new IpAccessControlParam[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new IpAccessControlParam(source.Data[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

