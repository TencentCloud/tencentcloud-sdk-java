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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSharedCNAMERequest extends AbstractModel {

    /**
    * 共享 CNAME 所属站点的 ID。	
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 共享 CNAME 前缀。请输入合法的域名前缀，例如"test-api"、"test-api.com"，限制输入 50 个字符。

共享 CNAME 完整格式为：<自定义前缀>+<zoneid中的12位随机字符串>+"share.dnse[0-5].com"。

例如前缀传入 example.com，EO 会为您创建共享 CNAME：example.com.sai2ig51kaa5.share.dnse2.com。
    */
    @SerializedName("SharedCNAMEPrefix")
    @Expose
    private String SharedCNAMEPrefix;

    /**
    * 描述。可输入 1-50 个任意字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 共享 CNAME 所属站点的 ID。	 
     * @return ZoneId 共享 CNAME 所属站点的 ID。	
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 共享 CNAME 所属站点的 ID。	
     * @param ZoneId 共享 CNAME 所属站点的 ID。	
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 共享 CNAME 前缀。请输入合法的域名前缀，例如"test-api"、"test-api.com"，限制输入 50 个字符。

共享 CNAME 完整格式为：<自定义前缀>+<zoneid中的12位随机字符串>+"share.dnse[0-5].com"。

例如前缀传入 example.com，EO 会为您创建共享 CNAME：example.com.sai2ig51kaa5.share.dnse2.com。 
     * @return SharedCNAMEPrefix 共享 CNAME 前缀。请输入合法的域名前缀，例如"test-api"、"test-api.com"，限制输入 50 个字符。

共享 CNAME 完整格式为：<自定义前缀>+<zoneid中的12位随机字符串>+"share.dnse[0-5].com"。

例如前缀传入 example.com，EO 会为您创建共享 CNAME：example.com.sai2ig51kaa5.share.dnse2.com。
     */
    public String getSharedCNAMEPrefix() {
        return this.SharedCNAMEPrefix;
    }

    /**
     * Set 共享 CNAME 前缀。请输入合法的域名前缀，例如"test-api"、"test-api.com"，限制输入 50 个字符。

共享 CNAME 完整格式为：<自定义前缀>+<zoneid中的12位随机字符串>+"share.dnse[0-5].com"。

例如前缀传入 example.com，EO 会为您创建共享 CNAME：example.com.sai2ig51kaa5.share.dnse2.com。
     * @param SharedCNAMEPrefix 共享 CNAME 前缀。请输入合法的域名前缀，例如"test-api"、"test-api.com"，限制输入 50 个字符。

共享 CNAME 完整格式为：<自定义前缀>+<zoneid中的12位随机字符串>+"share.dnse[0-5].com"。

例如前缀传入 example.com，EO 会为您创建共享 CNAME：example.com.sai2ig51kaa5.share.dnse2.com。
     */
    public void setSharedCNAMEPrefix(String SharedCNAMEPrefix) {
        this.SharedCNAMEPrefix = SharedCNAMEPrefix;
    }

    /**
     * Get 描述。可输入 1-50 个任意字符。 
     * @return Description 描述。可输入 1-50 个任意字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述。可输入 1-50 个任意字符。
     * @param Description 描述。可输入 1-50 个任意字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateSharedCNAMERequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSharedCNAMERequest(CreateSharedCNAMERequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.SharedCNAMEPrefix != null) {
            this.SharedCNAMEPrefix = new String(source.SharedCNAMEPrefix);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "SharedCNAMEPrefix", this.SharedCNAMEPrefix);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

