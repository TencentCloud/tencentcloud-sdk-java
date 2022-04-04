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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseSummary extends AbstractModel{

    /**
    * 许可证标识符
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 许可证的SPDX标识符，见 https://spdx.org/licenses/
    */
    @SerializedName("SPDXKey")
    @Expose
    private String SPDXKey;

    /**
    * 许可证短名称
    */
    @SerializedName("ShortName")
    @Expose
    private String ShortName;

    /**
    * 许可证完整名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * License风险等级
<li>NotDefined</li>
<li>LowRisk</li>
<li>MediumRisk</li>
<li>HighRisk</li>
    */
    @SerializedName("Risk")
    @Expose
    private String Risk;

    /**
    * 许可证来源URL
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
     * Get 许可证标识符 
     * @return Key 许可证标识符
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 许可证标识符
     * @param Key 许可证标识符
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 许可证的SPDX标识符，见 https://spdx.org/licenses/ 
     * @return SPDXKey 许可证的SPDX标识符，见 https://spdx.org/licenses/
     */
    public String getSPDXKey() {
        return this.SPDXKey;
    }

    /**
     * Set 许可证的SPDX标识符，见 https://spdx.org/licenses/
     * @param SPDXKey 许可证的SPDX标识符，见 https://spdx.org/licenses/
     */
    public void setSPDXKey(String SPDXKey) {
        this.SPDXKey = SPDXKey;
    }

    /**
     * Get 许可证短名称 
     * @return ShortName 许可证短名称
     */
    public String getShortName() {
        return this.ShortName;
    }

    /**
     * Set 许可证短名称
     * @param ShortName 许可证短名称
     */
    public void setShortName(String ShortName) {
        this.ShortName = ShortName;
    }

    /**
     * Get 许可证完整名称 
     * @return Name 许可证完整名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 许可证完整名称
     * @param Name 许可证完整名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get License风险等级
<li>NotDefined</li>
<li>LowRisk</li>
<li>MediumRisk</li>
<li>HighRisk</li> 
     * @return Risk License风险等级
<li>NotDefined</li>
<li>LowRisk</li>
<li>MediumRisk</li>
<li>HighRisk</li>
     */
    public String getRisk() {
        return this.Risk;
    }

    /**
     * Set License风险等级
<li>NotDefined</li>
<li>LowRisk</li>
<li>MediumRisk</li>
<li>HighRisk</li>
     * @param Risk License风险等级
<li>NotDefined</li>
<li>LowRisk</li>
<li>MediumRisk</li>
<li>HighRisk</li>
     */
    public void setRisk(String Risk) {
        this.Risk = Risk;
    }

    /**
     * Get 许可证来源URL 
     * @return Source 许可证来源URL
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 许可证来源URL
     * @param Source 许可证来源URL
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    public LicenseSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseSummary(LicenseSummary source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.SPDXKey != null) {
            this.SPDXKey = new String(source.SPDXKey);
        }
        if (source.ShortName != null) {
            this.ShortName = new String(source.ShortName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Risk != null) {
            this.Risk = new String(source.Risk);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "SPDXKey", this.SPDXKey);
        this.setParamSimple(map, prefix + "ShortName", this.ShortName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Risk", this.Risk);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

