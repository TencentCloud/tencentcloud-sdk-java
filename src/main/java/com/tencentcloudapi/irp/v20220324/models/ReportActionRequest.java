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
package com.tencentcloudapi.irp.v20220324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportActionRequest extends AbstractModel{

    /**
    * 业务id
    */
    @SerializedName("Bid")
    @Expose
    private String Bid;

    /**
    * 上报的行为对象数组，数量不超过50
    */
    @SerializedName("DocBehaviorList")
    @Expose
    private DocBehavior [] DocBehaviorList;

    /**
     * Get 业务id 
     * @return Bid 业务id
     */
    public String getBid() {
        return this.Bid;
    }

    /**
     * Set 业务id
     * @param Bid 业务id
     */
    public void setBid(String Bid) {
        this.Bid = Bid;
    }

    /**
     * Get 上报的行为对象数组，数量不超过50 
     * @return DocBehaviorList 上报的行为对象数组，数量不超过50
     */
    public DocBehavior [] getDocBehaviorList() {
        return this.DocBehaviorList;
    }

    /**
     * Set 上报的行为对象数组，数量不超过50
     * @param DocBehaviorList 上报的行为对象数组，数量不超过50
     */
    public void setDocBehaviorList(DocBehavior [] DocBehaviorList) {
        this.DocBehaviorList = DocBehaviorList;
    }

    public ReportActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportActionRequest(ReportActionRequest source) {
        if (source.Bid != null) {
            this.Bid = new String(source.Bid);
        }
        if (source.DocBehaviorList != null) {
            this.DocBehaviorList = new DocBehavior[source.DocBehaviorList.length];
            for (int i = 0; i < source.DocBehaviorList.length; i++) {
                this.DocBehaviorList[i] = new DocBehavior(source.DocBehaviorList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bid", this.Bid);
        this.setParamArrayObj(map, prefix + "DocBehaviorList.", this.DocBehaviorList);

    }
}

