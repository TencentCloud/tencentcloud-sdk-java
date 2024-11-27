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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseHeaderDetail extends AbstractModel {

    /**
    * 表头日期
    */
    @SerializedName("HeadDetail")
    @Expose
    private AnalyseHeaderTimeDetail [] HeadDetail;

    /**
    * 时间
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 总计
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
     * Get 表头日期 
     * @return HeadDetail 表头日期
     */
    public AnalyseHeaderTimeDetail [] getHeadDetail() {
        return this.HeadDetail;
    }

    /**
     * Set 表头日期
     * @param HeadDetail 表头日期
     */
    public void setHeadDetail(AnalyseHeaderTimeDetail [] HeadDetail) {
        this.HeadDetail = HeadDetail;
    }

    /**
     * Get 时间 
     * @return Name 时间
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 时间
     * @param Name 时间
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 总计 
     * @return Total 总计
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 总计
     * @param Total 总计
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    public AnalyseHeaderDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyseHeaderDetail(AnalyseHeaderDetail source) {
        if (source.HeadDetail != null) {
            this.HeadDetail = new AnalyseHeaderTimeDetail[source.HeadDetail.length];
            for (int i = 0; i < source.HeadDetail.length; i++) {
                this.HeadDetail[i] = new AnalyseHeaderTimeDetail(source.HeadDetail[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HeadDetail.", this.HeadDetail);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

