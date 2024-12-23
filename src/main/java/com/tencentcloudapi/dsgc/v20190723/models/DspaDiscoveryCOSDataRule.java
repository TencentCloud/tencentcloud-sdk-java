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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDiscoveryCOSDataRule extends AbstractModel {

    /**
    * 只能取and 、or两个值其中之一，and：字段和内容同时满足，or：字段和内容满足其一.
默认值为or
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 规则内容
    */
    @SerializedName("Contents")
    @Expose
    private DspaDiscoveryDataContent [] Contents;

    /**
     * Get 只能取and 、or两个值其中之一，and：字段和内容同时满足，or：字段和内容满足其一.
默认值为or 
     * @return Operator 只能取and 、or两个值其中之一，and：字段和内容同时满足，or：字段和内容满足其一.
默认值为or
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 只能取and 、or两个值其中之一，and：字段和内容同时满足，or：字段和内容满足其一.
默认值为or
     * @param Operator 只能取and 、or两个值其中之一，and：字段和内容同时满足，or：字段和内容满足其一.
默认值为or
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 规则内容 
     * @return Contents 规则内容
     */
    public DspaDiscoveryDataContent [] getContents() {
        return this.Contents;
    }

    /**
     * Set 规则内容
     * @param Contents 规则内容
     */
    public void setContents(DspaDiscoveryDataContent [] Contents) {
        this.Contents = Contents;
    }

    public DspaDiscoveryCOSDataRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryCOSDataRule(DspaDiscoveryCOSDataRule source) {
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Contents != null) {
            this.Contents = new DspaDiscoveryDataContent[source.Contents.length];
            for (int i = 0; i < source.Contents.length; i++) {
                this.Contents[i] = new DspaDiscoveryDataContent(source.Contents[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArrayObj(map, prefix + "Contents.", this.Contents);

    }
}

