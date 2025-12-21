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

public class InstanceNameSettings extends AbstractModel {

    /**
    * 云服务器的实例名。字符长度为[2, 108]。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 云服务器实例名的风格，取值范围包括 ORIGINAL 和 UNIQUE，默认为 ORIGINAL。

ORIGINAL，AS 直接将入参中所填的 InstanceName 传递给 CVM，CVM 可能会对 InstanceName 追加序列号，伸缩组中实例的 InstanceName 会出现冲突的情况。

UNIQUE，入参所填的 InstanceName 相当于实例名前缀，AS 和 CVM 会对其进行拓展，伸缩组中实例的 InstanceName 可以保证唯一。
    */
    @SerializedName("InstanceNameStyle")
    @Expose
    private String InstanceNameStyle;

    /**
    * 云服务器实例名后缀。字符长度为[1,105]，且与 InstanceName 的长度和不能超过107。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceNameSuffix")
    @Expose
    private String InstanceNameSuffix;

    /**
    * 云服务器的实例名分隔符。默认的分隔符是点号（.），可选短横线（-）或空字符串。
分隔符用于拼接实例名，递增序号，后缀。假设实例名为 testGpu4090 ，递增序号为 0007，后缀为 server：
- 分隔符为英文点号（.），最终拼接为 testGpu4090.007.server
- 分隔符为短横线（-），最终拼接为 testGpu4090-007-server
- 分隔符为空字符串，最终拼接为 testGpu4090007server
    */
    @SerializedName("InstanceNameDelimiter")
    @Expose
    private String InstanceNameDelimiter;

    /**
     * Get 云服务器的实例名。字符长度为[2, 108]。 
     * @return InstanceName 云服务器的实例名。字符长度为[2, 108]。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 云服务器的实例名。字符长度为[2, 108]。
     * @param InstanceName 云服务器的实例名。字符长度为[2, 108]。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 云服务器实例名的风格，取值范围包括 ORIGINAL 和 UNIQUE，默认为 ORIGINAL。

ORIGINAL，AS 直接将入参中所填的 InstanceName 传递给 CVM，CVM 可能会对 InstanceName 追加序列号，伸缩组中实例的 InstanceName 会出现冲突的情况。

UNIQUE，入参所填的 InstanceName 相当于实例名前缀，AS 和 CVM 会对其进行拓展，伸缩组中实例的 InstanceName 可以保证唯一。 
     * @return InstanceNameStyle 云服务器实例名的风格，取值范围包括 ORIGINAL 和 UNIQUE，默认为 ORIGINAL。

ORIGINAL，AS 直接将入参中所填的 InstanceName 传递给 CVM，CVM 可能会对 InstanceName 追加序列号，伸缩组中实例的 InstanceName 会出现冲突的情况。

UNIQUE，入参所填的 InstanceName 相当于实例名前缀，AS 和 CVM 会对其进行拓展，伸缩组中实例的 InstanceName 可以保证唯一。
     */
    public String getInstanceNameStyle() {
        return this.InstanceNameStyle;
    }

    /**
     * Set 云服务器实例名的风格，取值范围包括 ORIGINAL 和 UNIQUE，默认为 ORIGINAL。

ORIGINAL，AS 直接将入参中所填的 InstanceName 传递给 CVM，CVM 可能会对 InstanceName 追加序列号，伸缩组中实例的 InstanceName 会出现冲突的情况。

UNIQUE，入参所填的 InstanceName 相当于实例名前缀，AS 和 CVM 会对其进行拓展，伸缩组中实例的 InstanceName 可以保证唯一。
     * @param InstanceNameStyle 云服务器实例名的风格，取值范围包括 ORIGINAL 和 UNIQUE，默认为 ORIGINAL。

ORIGINAL，AS 直接将入参中所填的 InstanceName 传递给 CVM，CVM 可能会对 InstanceName 追加序列号，伸缩组中实例的 InstanceName 会出现冲突的情况。

UNIQUE，入参所填的 InstanceName 相当于实例名前缀，AS 和 CVM 会对其进行拓展，伸缩组中实例的 InstanceName 可以保证唯一。
     */
    public void setInstanceNameStyle(String InstanceNameStyle) {
        this.InstanceNameStyle = InstanceNameStyle;
    }

    /**
     * Get 云服务器实例名后缀。字符长度为[1,105]，且与 InstanceName 的长度和不能超过107。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceNameSuffix 云服务器实例名后缀。字符长度为[1,105]，且与 InstanceName 的长度和不能超过107。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceNameSuffix() {
        return this.InstanceNameSuffix;
    }

    /**
     * Set 云服务器实例名后缀。字符长度为[1,105]，且与 InstanceName 的长度和不能超过107。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceNameSuffix 云服务器实例名后缀。字符长度为[1,105]，且与 InstanceName 的长度和不能超过107。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceNameSuffix(String InstanceNameSuffix) {
        this.InstanceNameSuffix = InstanceNameSuffix;
    }

    /**
     * Get 云服务器的实例名分隔符。默认的分隔符是点号（.），可选短横线（-）或空字符串。
分隔符用于拼接实例名，递增序号，后缀。假设实例名为 testGpu4090 ，递增序号为 0007，后缀为 server：
- 分隔符为英文点号（.），最终拼接为 testGpu4090.007.server
- 分隔符为短横线（-），最终拼接为 testGpu4090-007-server
- 分隔符为空字符串，最终拼接为 testGpu4090007server 
     * @return InstanceNameDelimiter 云服务器的实例名分隔符。默认的分隔符是点号（.），可选短横线（-）或空字符串。
分隔符用于拼接实例名，递增序号，后缀。假设实例名为 testGpu4090 ，递增序号为 0007，后缀为 server：
- 分隔符为英文点号（.），最终拼接为 testGpu4090.007.server
- 分隔符为短横线（-），最终拼接为 testGpu4090-007-server
- 分隔符为空字符串，最终拼接为 testGpu4090007server
     */
    public String getInstanceNameDelimiter() {
        return this.InstanceNameDelimiter;
    }

    /**
     * Set 云服务器的实例名分隔符。默认的分隔符是点号（.），可选短横线（-）或空字符串。
分隔符用于拼接实例名，递增序号，后缀。假设实例名为 testGpu4090 ，递增序号为 0007，后缀为 server：
- 分隔符为英文点号（.），最终拼接为 testGpu4090.007.server
- 分隔符为短横线（-），最终拼接为 testGpu4090-007-server
- 分隔符为空字符串，最终拼接为 testGpu4090007server
     * @param InstanceNameDelimiter 云服务器的实例名分隔符。默认的分隔符是点号（.），可选短横线（-）或空字符串。
分隔符用于拼接实例名，递增序号，后缀。假设实例名为 testGpu4090 ，递增序号为 0007，后缀为 server：
- 分隔符为英文点号（.），最终拼接为 testGpu4090.007.server
- 分隔符为短横线（-），最终拼接为 testGpu4090-007-server
- 分隔符为空字符串，最终拼接为 testGpu4090007server
     */
    public void setInstanceNameDelimiter(String InstanceNameDelimiter) {
        this.InstanceNameDelimiter = InstanceNameDelimiter;
    }

    public InstanceNameSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNameSettings(InstanceNameSettings source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceNameStyle != null) {
            this.InstanceNameStyle = new String(source.InstanceNameStyle);
        }
        if (source.InstanceNameSuffix != null) {
            this.InstanceNameSuffix = new String(source.InstanceNameSuffix);
        }
        if (source.InstanceNameDelimiter != null) {
            this.InstanceNameDelimiter = new String(source.InstanceNameDelimiter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceNameStyle", this.InstanceNameStyle);
        this.setParamSimple(map, prefix + "InstanceNameSuffix", this.InstanceNameSuffix);
        this.setParamSimple(map, prefix + "InstanceNameDelimiter", this.InstanceNameDelimiter);

    }
}

