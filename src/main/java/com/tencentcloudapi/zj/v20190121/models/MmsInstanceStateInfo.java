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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MmsInstanceStateInfo extends AbstractModel{

    /**
    * 运营商
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 审核状态：0未审核，1审核通过，2审核拒绝
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
     * Get 运营商 
     * @return Operator 运营商
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 运营商
     * @param Operator 运营商
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 审核状态：0未审核，1审核通过，2审核拒绝 
     * @return State 审核状态：0未审核，1审核通过，2审核拒绝
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 审核状态：0未审核，1审核通过，2审核拒绝
     * @param State 审核状态：0未审核，1审核通过，2审核拒绝
     */
    public void setState(Long State) {
        this.State = State;
    }

    public MmsInstanceStateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MmsInstanceStateInfo(MmsInstanceStateInfo source) {
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

