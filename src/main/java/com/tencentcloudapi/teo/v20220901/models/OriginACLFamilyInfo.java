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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginACLFamilyInfo extends AbstractModel {

    /**
    * 源站防护版本号。
格式说明：
标准版本：
<li>gaz-xxxxx：全球；</li>
<li>mlc-xxxxx：中国；</li>
<li>emc-xxxxx：海外(全球不含中国)；</li>
精简版(平台级版本)：
<li>plat-gaz-xxxxxx：精简全球版；</li>
<li>plat-mlc-xxxxxx：精简中国版；</li>
<li>plat-emc-xxxxxx：精简海外(全球不含中国)版；</li>
缩写说明：
<li>gaz：Global AZ Availability Zone;</li>
<li>mlc：mainlandChina;</li>
<li>emc：Exclude mainlandChina.</li>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 版本生效时间，时间是北京时间 UTC+8， 遵循 ISO 8601 标准的日期和时间格式。
    */
    @SerializedName("ActiveTime")
    @Expose
    private String ActiveTime;

    /**
    * 回源 IP 网段详情。	
    */
    @SerializedName("EntireAddresses")
    @Expose
    private Addresses EntireAddresses;

    /**
    * 源站防护回源ACL控制域。取值说明如下：
<li>gaz：标准全球可用区控制域；</li>
<li>mlc：标准中国大陆可用区控制域；</li>
<li>emc：标准全球(不含中国大陆)可用区控制域；</li>
<li>plat-gaz：精简全球可用区控制域；</li>
<li>plat-mlc：精简中国大陆可用区控制域；</li>
<li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li>
    */
    @SerializedName("OriginACLFamily")
    @Expose
    private String OriginACLFamily;

    /**
     * Get 源站防护版本号。
格式说明：
标准版本：
<li>gaz-xxxxx：全球；</li>
<li>mlc-xxxxx：中国；</li>
<li>emc-xxxxx：海外(全球不含中国)；</li>
精简版(平台级版本)：
<li>plat-gaz-xxxxxx：精简全球版；</li>
<li>plat-mlc-xxxxxx：精简中国版；</li>
<li>plat-emc-xxxxxx：精简海外(全球不含中国)版；</li>
缩写说明：
<li>gaz：Global AZ Availability Zone;</li>
<li>mlc：mainlandChina;</li>
<li>emc：Exclude mainlandChina.</li> 
     * @return Version 源站防护版本号。
格式说明：
标准版本：
<li>gaz-xxxxx：全球；</li>
<li>mlc-xxxxx：中国；</li>
<li>emc-xxxxx：海外(全球不含中国)；</li>
精简版(平台级版本)：
<li>plat-gaz-xxxxxx：精简全球版；</li>
<li>plat-mlc-xxxxxx：精简中国版；</li>
<li>plat-emc-xxxxxx：精简海外(全球不含中国)版；</li>
缩写说明：
<li>gaz：Global AZ Availability Zone;</li>
<li>mlc：mainlandChina;</li>
<li>emc：Exclude mainlandChina.</li>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 源站防护版本号。
格式说明：
标准版本：
<li>gaz-xxxxx：全球；</li>
<li>mlc-xxxxx：中国；</li>
<li>emc-xxxxx：海外(全球不含中国)；</li>
精简版(平台级版本)：
<li>plat-gaz-xxxxxx：精简全球版；</li>
<li>plat-mlc-xxxxxx：精简中国版；</li>
<li>plat-emc-xxxxxx：精简海外(全球不含中国)版；</li>
缩写说明：
<li>gaz：Global AZ Availability Zone;</li>
<li>mlc：mainlandChina;</li>
<li>emc：Exclude mainlandChina.</li>
     * @param Version 源站防护版本号。
格式说明：
标准版本：
<li>gaz-xxxxx：全球；</li>
<li>mlc-xxxxx：中国；</li>
<li>emc-xxxxx：海外(全球不含中国)；</li>
精简版(平台级版本)：
<li>plat-gaz-xxxxxx：精简全球版；</li>
<li>plat-mlc-xxxxxx：精简中国版；</li>
<li>plat-emc-xxxxxx：精简海外(全球不含中国)版；</li>
缩写说明：
<li>gaz：Global AZ Availability Zone;</li>
<li>mlc：mainlandChina;</li>
<li>emc：Exclude mainlandChina.</li>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 版本生效时间，时间是北京时间 UTC+8， 遵循 ISO 8601 标准的日期和时间格式。 
     * @return ActiveTime 版本生效时间，时间是北京时间 UTC+8， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public String getActiveTime() {
        return this.ActiveTime;
    }

    /**
     * Set 版本生效时间，时间是北京时间 UTC+8， 遵循 ISO 8601 标准的日期和时间格式。
     * @param ActiveTime 版本生效时间，时间是北京时间 UTC+8， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public void setActiveTime(String ActiveTime) {
        this.ActiveTime = ActiveTime;
    }

    /**
     * Get 回源 IP 网段详情。	 
     * @return EntireAddresses 回源 IP 网段详情。	
     */
    public Addresses getEntireAddresses() {
        return this.EntireAddresses;
    }

    /**
     * Set 回源 IP 网段详情。	
     * @param EntireAddresses 回源 IP 网段详情。	
     */
    public void setEntireAddresses(Addresses EntireAddresses) {
        this.EntireAddresses = EntireAddresses;
    }

    /**
     * Get 源站防护回源ACL控制域。取值说明如下：
<li>gaz：标准全球可用区控制域；</li>
<li>mlc：标准中国大陆可用区控制域；</li>
<li>emc：标准全球(不含中国大陆)可用区控制域；</li>
<li>plat-gaz：精简全球可用区控制域；</li>
<li>plat-mlc：精简中国大陆可用区控制域；</li>
<li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li> 
     * @return OriginACLFamily 源站防护回源ACL控制域。取值说明如下：
<li>gaz：标准全球可用区控制域；</li>
<li>mlc：标准中国大陆可用区控制域；</li>
<li>emc：标准全球(不含中国大陆)可用区控制域；</li>
<li>plat-gaz：精简全球可用区控制域；</li>
<li>plat-mlc：精简中国大陆可用区控制域；</li>
<li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li>
     */
    public String getOriginACLFamily() {
        return this.OriginACLFamily;
    }

    /**
     * Set 源站防护回源ACL控制域。取值说明如下：
<li>gaz：标准全球可用区控制域；</li>
<li>mlc：标准中国大陆可用区控制域；</li>
<li>emc：标准全球(不含中国大陆)可用区控制域；</li>
<li>plat-gaz：精简全球可用区控制域；</li>
<li>plat-mlc：精简中国大陆可用区控制域；</li>
<li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li>
     * @param OriginACLFamily 源站防护回源ACL控制域。取值说明如下：
<li>gaz：标准全球可用区控制域；</li>
<li>mlc：标准中国大陆可用区控制域；</li>
<li>emc：标准全球(不含中国大陆)可用区控制域；</li>
<li>plat-gaz：精简全球可用区控制域；</li>
<li>plat-mlc：精简中国大陆可用区控制域；</li>
<li>plat-emc：精简全球(不含中国大陆)可用区控制域；</li>
     */
    public void setOriginACLFamily(String OriginACLFamily) {
        this.OriginACLFamily = OriginACLFamily;
    }

    public OriginACLFamilyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginACLFamilyInfo(OriginACLFamilyInfo source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ActiveTime != null) {
            this.ActiveTime = new String(source.ActiveTime);
        }
        if (source.EntireAddresses != null) {
            this.EntireAddresses = new Addresses(source.EntireAddresses);
        }
        if (source.OriginACLFamily != null) {
            this.OriginACLFamily = new String(source.OriginACLFamily);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamObj(map, prefix + "EntireAddresses.", this.EntireAddresses);
        this.setParamSimple(map, prefix + "OriginACLFamily", this.OriginACLFamily);

    }
}

