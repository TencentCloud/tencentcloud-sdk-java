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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostInfoRequest extends AbstractModel {

    /**
    * 主机Quuid数组
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
    * Uuids 查询，Quuid查询时填空
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
     * Get 主机Quuid数组 
     * @return QuuidList 主机Quuid数组
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set 主机Quuid数组
     * @param QuuidList 主机Quuid数组
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    /**
     * Get Uuids 查询，Quuid查询时填空 
     * @return Uuids Uuids 查询，Quuid查询时填空
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set Uuids 查询，Quuid查询时填空
     * @param Uuids Uuids 查询，Quuid查询时填空
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    public DescribeHostInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostInfoRequest(DescribeHostInfoRequest source) {
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);

    }
}

