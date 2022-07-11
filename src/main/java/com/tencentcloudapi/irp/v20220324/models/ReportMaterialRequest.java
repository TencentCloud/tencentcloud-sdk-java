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

public class ReportMaterialRequest extends AbstractModel{

    /**
    * 业务id
    */
    @SerializedName("Bid")
    @Expose
    private String Bid;

    /**
    * 上报的信息流数组，一次数量不超过50
    */
    @SerializedName("DocItemList")
    @Expose
    private DocItem [] DocItemList;

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
     * Get 上报的信息流数组，一次数量不超过50 
     * @return DocItemList 上报的信息流数组，一次数量不超过50
     */
    public DocItem [] getDocItemList() {
        return this.DocItemList;
    }

    /**
     * Set 上报的信息流数组，一次数量不超过50
     * @param DocItemList 上报的信息流数组，一次数量不超过50
     */
    public void setDocItemList(DocItem [] DocItemList) {
        this.DocItemList = DocItemList;
    }

    public ReportMaterialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportMaterialRequest(ReportMaterialRequest source) {
        if (source.Bid != null) {
            this.Bid = new String(source.Bid);
        }
        if (source.DocItemList != null) {
            this.DocItemList = new DocItem[source.DocItemList.length];
            for (int i = 0; i < source.DocItemList.length; i++) {
                this.DocItemList[i] = new DocItem(source.DocItemList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bid", this.Bid);
        this.setParamArrayObj(map, prefix + "DocItemList.", this.DocItemList);

    }
}

