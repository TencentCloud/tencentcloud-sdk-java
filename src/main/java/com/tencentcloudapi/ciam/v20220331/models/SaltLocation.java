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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaltLocation extends AbstractModel{

    /**
    * 密码加盐的类型（HEAD，TAIL，OTHER）
    */
    @SerializedName("SaltLocationTypeEnum")
    @Expose
    private String SaltLocationTypeEnum;

    /**
    * 加盐规则
    */
    @SerializedName("SaltLocationRule")
    @Expose
    private SaltLocationRule SaltLocationRule;

    /**
     * Get 密码加盐的类型（HEAD，TAIL，OTHER） 
     * @return SaltLocationTypeEnum 密码加盐的类型（HEAD，TAIL，OTHER）
     */
    public String getSaltLocationTypeEnum() {
        return this.SaltLocationTypeEnum;
    }

    /**
     * Set 密码加盐的类型（HEAD，TAIL，OTHER）
     * @param SaltLocationTypeEnum 密码加盐的类型（HEAD，TAIL，OTHER）
     */
    public void setSaltLocationTypeEnum(String SaltLocationTypeEnum) {
        this.SaltLocationTypeEnum = SaltLocationTypeEnum;
    }

    /**
     * Get 加盐规则 
     * @return SaltLocationRule 加盐规则
     */
    public SaltLocationRule getSaltLocationRule() {
        return this.SaltLocationRule;
    }

    /**
     * Set 加盐规则
     * @param SaltLocationRule 加盐规则
     */
    public void setSaltLocationRule(SaltLocationRule SaltLocationRule) {
        this.SaltLocationRule = SaltLocationRule;
    }

    public SaltLocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaltLocation(SaltLocation source) {
        if (source.SaltLocationTypeEnum != null) {
            this.SaltLocationTypeEnum = new String(source.SaltLocationTypeEnum);
        }
        if (source.SaltLocationRule != null) {
            this.SaltLocationRule = new SaltLocationRule(source.SaltLocationRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SaltLocationTypeEnum", this.SaltLocationTypeEnum);
        this.setParamObj(map, prefix + "SaltLocationRule.", this.SaltLocationRule);

    }
}

