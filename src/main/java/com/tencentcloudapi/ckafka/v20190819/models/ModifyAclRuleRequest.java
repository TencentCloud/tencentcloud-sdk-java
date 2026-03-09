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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAclRuleRequest extends AbstractModel {

    /**
    * <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>ACL规则名</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>修改预设规则时传入,是否应用到新增的Topic</p><p>枚举值：</p><ul><li>0： 不允许应用到新增的topic</li><li>1： 允许应用到新增的topic</li></ul><p>默认值：0</p>
    */
    @SerializedName("IsApplied")
    @Expose
    private Long IsApplied;

    /**
     * Get <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p> 
     * @return InstanceId <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     * @param InstanceId <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>ACL规则名</p> 
     * @return RuleName <p>ACL规则名</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>ACL规则名</p>
     * @param RuleName <p>ACL规则名</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>修改预设规则时传入,是否应用到新增的Topic</p><p>枚举值：</p><ul><li>0： 不允许应用到新增的topic</li><li>1： 允许应用到新增的topic</li></ul><p>默认值：0</p> 
     * @return IsApplied <p>修改预设规则时传入,是否应用到新增的Topic</p><p>枚举值：</p><ul><li>0： 不允许应用到新增的topic</li><li>1： 允许应用到新增的topic</li></ul><p>默认值：0</p>
     */
    public Long getIsApplied() {
        return this.IsApplied;
    }

    /**
     * Set <p>修改预设规则时传入,是否应用到新增的Topic</p><p>枚举值：</p><ul><li>0： 不允许应用到新增的topic</li><li>1： 允许应用到新增的topic</li></ul><p>默认值：0</p>
     * @param IsApplied <p>修改预设规则时传入,是否应用到新增的Topic</p><p>枚举值：</p><ul><li>0： 不允许应用到新增的topic</li><li>1： 允许应用到新增的topic</li></ul><p>默认值：0</p>
     */
    public void setIsApplied(Long IsApplied) {
        this.IsApplied = IsApplied;
    }

    public ModifyAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAclRuleRequest(ModifyAclRuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.IsApplied != null) {
            this.IsApplied = new Long(source.IsApplied);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "IsApplied", this.IsApplied);

    }
}

