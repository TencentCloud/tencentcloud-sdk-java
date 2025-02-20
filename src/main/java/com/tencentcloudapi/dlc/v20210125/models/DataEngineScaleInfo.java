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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataEngineScaleInfo extends AbstractModel {

    /**
    * 引擎ID
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 引擎名称
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * 引擎规格详情
    */
    @SerializedName("ScaleDetail")
    @Expose
    private DataEngineScaleInfoDetail [] ScaleDetail;

    /**
     * Get 引擎ID 
     * @return DataEngineId 引擎ID
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set 引擎ID
     * @param DataEngineId 引擎ID
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get 引擎名称 
     * @return DataEngineName 引擎名称
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 引擎名称
     * @param DataEngineName 引擎名称
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get 引擎规格详情 
     * @return ScaleDetail 引擎规格详情
     */
    public DataEngineScaleInfoDetail [] getScaleDetail() {
        return this.ScaleDetail;
    }

    /**
     * Set 引擎规格详情
     * @param ScaleDetail 引擎规格详情
     */
    public void setScaleDetail(DataEngineScaleInfoDetail [] ScaleDetail) {
        this.ScaleDetail = ScaleDetail;
    }

    public DataEngineScaleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataEngineScaleInfo(DataEngineScaleInfo source) {
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.ScaleDetail != null) {
            this.ScaleDetail = new DataEngineScaleInfoDetail[source.ScaleDetail.length];
            for (int i = 0; i < source.ScaleDetail.length; i++) {
                this.ScaleDetail[i] = new DataEngineScaleInfoDetail(source.ScaleDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamArrayObj(map, prefix + "ScaleDetail.", this.ScaleDetail);

    }
}

