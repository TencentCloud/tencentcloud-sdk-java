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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostNameSettings extends AbstractModel {

    /**
    * 云服务器的主机名。
<li> 点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。</li> 
<li> 不支持 Windows 实例。</li> 
<li> 其他类型（Linux 等）实例：字符长度为[2, 40]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。不允许为纯数字。</li> 
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 云服务器主机名的风格，取值范围包括 ORIGINAL 和  UNIQUE，默认为 ORIGINAL。
<li> ORIGINAL，AS 直接将入参中所填的 HostName 传递给 CVM，CVM 可能会对 HostName 追加序列号，伸缩组中实例的 HostName 会出现冲突的情况。</li> 
<li> UNIQUE，入参所填的 HostName 相当于主机名前缀，AS 和 CVM 会对其进行拓展，伸缩组中实例的 HostName 可以保证唯一。</li> 
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostNameStyle")
    @Expose
    private String HostNameStyle;

    /**
    * 云服务器的主机名后缀。
<li> 点号（.）和短横线（-）不能作为 HostNameSuffix 的首尾字符，不能连续使用。</li> 
<li> 不支持 Windows 实例。</li> 
<li>其他类型（Linux 等）实例：字符长度为[1, 37]，且与 HostName 的长度和不能超过 39，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。</li> 
假设后缀名称为 suffix，原主机名为 test.0，最终主机名为 test.0.suffix。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostNameSuffix")
    @Expose
    private String HostNameSuffix;

    /**
     * Get 云服务器的主机名。
<li> 点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。</li> 
<li> 不支持 Windows 实例。</li> 
<li> 其他类型（Linux 等）实例：字符长度为[2, 40]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。不允许为纯数字。</li> 
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostName 云服务器的主机名。
<li> 点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。</li> 
<li> 不支持 Windows 实例。</li> 
<li> 其他类型（Linux 等）实例：字符长度为[2, 40]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。不允许为纯数字。</li> 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 云服务器的主机名。
<li> 点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。</li> 
<li> 不支持 Windows 实例。</li> 
<li> 其他类型（Linux 等）实例：字符长度为[2, 40]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。不允许为纯数字。</li> 
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostName 云服务器的主机名。
<li> 点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。</li> 
<li> 不支持 Windows 实例。</li> 
<li> 其他类型（Linux 等）实例：字符长度为[2, 40]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。不允许为纯数字。</li> 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 云服务器主机名的风格，取值范围包括 ORIGINAL 和  UNIQUE，默认为 ORIGINAL。
<li> ORIGINAL，AS 直接将入参中所填的 HostName 传递给 CVM，CVM 可能会对 HostName 追加序列号，伸缩组中实例的 HostName 会出现冲突的情况。</li> 
<li> UNIQUE，入参所填的 HostName 相当于主机名前缀，AS 和 CVM 会对其进行拓展，伸缩组中实例的 HostName 可以保证唯一。</li> 
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostNameStyle 云服务器主机名的风格，取值范围包括 ORIGINAL 和  UNIQUE，默认为 ORIGINAL。
<li> ORIGINAL，AS 直接将入参中所填的 HostName 传递给 CVM，CVM 可能会对 HostName 追加序列号，伸缩组中实例的 HostName 会出现冲突的情况。</li> 
<li> UNIQUE，入参所填的 HostName 相当于主机名前缀，AS 和 CVM 会对其进行拓展，伸缩组中实例的 HostName 可以保证唯一。</li> 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostNameStyle() {
        return this.HostNameStyle;
    }

    /**
     * Set 云服务器主机名的风格，取值范围包括 ORIGINAL 和  UNIQUE，默认为 ORIGINAL。
<li> ORIGINAL，AS 直接将入参中所填的 HostName 传递给 CVM，CVM 可能会对 HostName 追加序列号，伸缩组中实例的 HostName 会出现冲突的情况。</li> 
<li> UNIQUE，入参所填的 HostName 相当于主机名前缀，AS 和 CVM 会对其进行拓展，伸缩组中实例的 HostName 可以保证唯一。</li> 
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostNameStyle 云服务器主机名的风格，取值范围包括 ORIGINAL 和  UNIQUE，默认为 ORIGINAL。
<li> ORIGINAL，AS 直接将入参中所填的 HostName 传递给 CVM，CVM 可能会对 HostName 追加序列号，伸缩组中实例的 HostName 会出现冲突的情况。</li> 
<li> UNIQUE，入参所填的 HostName 相当于主机名前缀，AS 和 CVM 会对其进行拓展，伸缩组中实例的 HostName 可以保证唯一。</li> 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostNameStyle(String HostNameStyle) {
        this.HostNameStyle = HostNameStyle;
    }

    /**
     * Get 云服务器的主机名后缀。
<li> 点号（.）和短横线（-）不能作为 HostNameSuffix 的首尾字符，不能连续使用。</li> 
<li> 不支持 Windows 实例。</li> 
<li>其他类型（Linux 等）实例：字符长度为[1, 37]，且与 HostName 的长度和不能超过 39，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。</li> 
假设后缀名称为 suffix，原主机名为 test.0，最终主机名为 test.0.suffix。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostNameSuffix 云服务器的主机名后缀。
<li> 点号（.）和短横线（-）不能作为 HostNameSuffix 的首尾字符，不能连续使用。</li> 
<li> 不支持 Windows 实例。</li> 
<li>其他类型（Linux 等）实例：字符长度为[1, 37]，且与 HostName 的长度和不能超过 39，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。</li> 
假设后缀名称为 suffix，原主机名为 test.0，最终主机名为 test.0.suffix。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostNameSuffix() {
        return this.HostNameSuffix;
    }

    /**
     * Set 云服务器的主机名后缀。
<li> 点号（.）和短横线（-）不能作为 HostNameSuffix 的首尾字符，不能连续使用。</li> 
<li> 不支持 Windows 实例。</li> 
<li>其他类型（Linux 等）实例：字符长度为[1, 37]，且与 HostName 的长度和不能超过 39，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。</li> 
假设后缀名称为 suffix，原主机名为 test.0，最终主机名为 test.0.suffix。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostNameSuffix 云服务器的主机名后缀。
<li> 点号（.）和短横线（-）不能作为 HostNameSuffix 的首尾字符，不能连续使用。</li> 
<li> 不支持 Windows 实例。</li> 
<li>其他类型（Linux 等）实例：字符长度为[1, 37]，且与 HostName 的长度和不能超过 39，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。</li> 
假设后缀名称为 suffix，原主机名为 test.0，最终主机名为 test.0.suffix。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostNameSuffix(String HostNameSuffix) {
        this.HostNameSuffix = HostNameSuffix;
    }

    public HostNameSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostNameSettings(HostNameSettings source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostNameStyle != null) {
            this.HostNameStyle = new String(source.HostNameStyle);
        }
        if (source.HostNameSuffix != null) {
            this.HostNameSuffix = new String(source.HostNameSuffix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostNameStyle", this.HostNameStyle);
        this.setParamSimple(map, prefix + "HostNameSuffix", this.HostNameSuffix);

    }
}

