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

public class HostNameIndexSettings extends AbstractModel {

    /**
    * <p>是否开启实例主机名创建序号，默认不开启。取值范围：</p><p>TRUE：表示开启实例主机名创建序号FALSE：表示不开启实例主机名创建序号</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>初始序号。取值范围与 IndexLength 参数有关：- IndexLength 为 0 时，取值范围为 [0, 99999999]。- IndexLength 为 [1, 8] 时，取值范围为 [0, 10^IndexLength-1]，最大值即为指定位数的最大数字。初始序号默认值如下：- 首次启用递增序号：初始序号默认值为 0 （ 展示位数与 IndexLength 有关，例如 IndexLength 为  4，展示值为 0000）- 非首次开启递增序号：顺延之前的递增序号，例如上次使用递增至序号 069，则新的初始序号默认值为 070。注意：修改初始序号可能会造成伸缩组内序号重复。</p>
    */
    @SerializedName("BeginIndex")
    @Expose
    private Long BeginIndex;

    /**
    * <p>递增序号长度，默认为0，表示不指定序号长度。 取值范围：0-8，最大为整数8。 - 长度设置为3，序号展示形式为：000、001、002 ... 010、011 ... 100 ... 999，序号上限为999- 长度设置为0，序号展示形式为：0、1、2 ... 10、11 ... 100 ... 1000 ...10000 ... 99999999，序号上限为99999999注意：递增序号持续超出上限会导致扩容失败，请不要设置过小的递增序号长度。</p>
    */
    @SerializedName("IndexLength")
    @Expose
    private Long IndexLength;

    /**
     * Get <p>是否开启实例主机名创建序号，默认不开启。取值范围：</p><p>TRUE：表示开启实例主机名创建序号FALSE：表示不开启实例主机名创建序号</p> 
     * @return Enabled <p>是否开启实例主机名创建序号，默认不开启。取值范围：</p><p>TRUE：表示开启实例主机名创建序号FALSE：表示不开启实例主机名创建序号</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否开启实例主机名创建序号，默认不开启。取值范围：</p><p>TRUE：表示开启实例主机名创建序号FALSE：表示不开启实例主机名创建序号</p>
     * @param Enabled <p>是否开启实例主机名创建序号，默认不开启。取值范围：</p><p>TRUE：表示开启实例主机名创建序号FALSE：表示不开启实例主机名创建序号</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>初始序号。取值范围与 IndexLength 参数有关：- IndexLength 为 0 时，取值范围为 [0, 99999999]。- IndexLength 为 [1, 8] 时，取值范围为 [0, 10^IndexLength-1]，最大值即为指定位数的最大数字。初始序号默认值如下：- 首次启用递增序号：初始序号默认值为 0 （ 展示位数与 IndexLength 有关，例如 IndexLength 为  4，展示值为 0000）- 非首次开启递增序号：顺延之前的递增序号，例如上次使用递增至序号 069，则新的初始序号默认值为 070。注意：修改初始序号可能会造成伸缩组内序号重复。</p> 
     * @return BeginIndex <p>初始序号。取值范围与 IndexLength 参数有关：- IndexLength 为 0 时，取值范围为 [0, 99999999]。- IndexLength 为 [1, 8] 时，取值范围为 [0, 10^IndexLength-1]，最大值即为指定位数的最大数字。初始序号默认值如下：- 首次启用递增序号：初始序号默认值为 0 （ 展示位数与 IndexLength 有关，例如 IndexLength 为  4，展示值为 0000）- 非首次开启递增序号：顺延之前的递增序号，例如上次使用递增至序号 069，则新的初始序号默认值为 070。注意：修改初始序号可能会造成伸缩组内序号重复。</p>
     */
    public Long getBeginIndex() {
        return this.BeginIndex;
    }

    /**
     * Set <p>初始序号。取值范围与 IndexLength 参数有关：- IndexLength 为 0 时，取值范围为 [0, 99999999]。- IndexLength 为 [1, 8] 时，取值范围为 [0, 10^IndexLength-1]，最大值即为指定位数的最大数字。初始序号默认值如下：- 首次启用递增序号：初始序号默认值为 0 （ 展示位数与 IndexLength 有关，例如 IndexLength 为  4，展示值为 0000）- 非首次开启递增序号：顺延之前的递增序号，例如上次使用递增至序号 069，则新的初始序号默认值为 070。注意：修改初始序号可能会造成伸缩组内序号重复。</p>
     * @param BeginIndex <p>初始序号。取值范围与 IndexLength 参数有关：- IndexLength 为 0 时，取值范围为 [0, 99999999]。- IndexLength 为 [1, 8] 时，取值范围为 [0, 10^IndexLength-1]，最大值即为指定位数的最大数字。初始序号默认值如下：- 首次启用递增序号：初始序号默认值为 0 （ 展示位数与 IndexLength 有关，例如 IndexLength 为  4，展示值为 0000）- 非首次开启递增序号：顺延之前的递增序号，例如上次使用递增至序号 069，则新的初始序号默认值为 070。注意：修改初始序号可能会造成伸缩组内序号重复。</p>
     */
    public void setBeginIndex(Long BeginIndex) {
        this.BeginIndex = BeginIndex;
    }

    /**
     * Get <p>递增序号长度，默认为0，表示不指定序号长度。 取值范围：0-8，最大为整数8。 - 长度设置为3，序号展示形式为：000、001、002 ... 010、011 ... 100 ... 999，序号上限为999- 长度设置为0，序号展示形式为：0、1、2 ... 10、11 ... 100 ... 1000 ...10000 ... 99999999，序号上限为99999999注意：递增序号持续超出上限会导致扩容失败，请不要设置过小的递增序号长度。</p> 
     * @return IndexLength <p>递增序号长度，默认为0，表示不指定序号长度。 取值范围：0-8，最大为整数8。 - 长度设置为3，序号展示形式为：000、001、002 ... 010、011 ... 100 ... 999，序号上限为999- 长度设置为0，序号展示形式为：0、1、2 ... 10、11 ... 100 ... 1000 ...10000 ... 99999999，序号上限为99999999注意：递增序号持续超出上限会导致扩容失败，请不要设置过小的递增序号长度。</p>
     */
    public Long getIndexLength() {
        return this.IndexLength;
    }

    /**
     * Set <p>递增序号长度，默认为0，表示不指定序号长度。 取值范围：0-8，最大为整数8。 - 长度设置为3，序号展示形式为：000、001、002 ... 010、011 ... 100 ... 999，序号上限为999- 长度设置为0，序号展示形式为：0、1、2 ... 10、11 ... 100 ... 1000 ...10000 ... 99999999，序号上限为99999999注意：递增序号持续超出上限会导致扩容失败，请不要设置过小的递增序号长度。</p>
     * @param IndexLength <p>递增序号长度，默认为0，表示不指定序号长度。 取值范围：0-8，最大为整数8。 - 长度设置为3，序号展示形式为：000、001、002 ... 010、011 ... 100 ... 999，序号上限为999- 长度设置为0，序号展示形式为：0、1、2 ... 10、11 ... 100 ... 1000 ...10000 ... 99999999，序号上限为99999999注意：递增序号持续超出上限会导致扩容失败，请不要设置过小的递增序号长度。</p>
     */
    public void setIndexLength(Long IndexLength) {
        this.IndexLength = IndexLength;
    }

    public HostNameIndexSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostNameIndexSettings(HostNameIndexSettings source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.BeginIndex != null) {
            this.BeginIndex = new Long(source.BeginIndex);
        }
        if (source.IndexLength != null) {
            this.IndexLength = new Long(source.IndexLength);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "BeginIndex", this.BeginIndex);
        this.setParamSimple(map, prefix + "IndexLength", this.IndexLength);

    }
}

