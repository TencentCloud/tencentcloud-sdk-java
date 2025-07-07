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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareDetailInfo extends AbstractModel {

    /**
    * 数据不一致的表详情
    */
    @SerializedName("Difference")
    @Expose
    private DifferenceDetail Difference;

    /**
    * 跳过校验的表详情
    */
    @SerializedName("Skipped")
    @Expose
    private SkippedDetail Skipped;

    /**
    * 数据库不一致的详情，mongodb业务用到
    */
    @SerializedName("DifferenceAdvancedObjects")
    @Expose
    private DifferenceAdvancedObjectsDetail DifferenceAdvancedObjects;

    /**
    * 数据不一致的详情，mongodb业务用到
    */
    @SerializedName("DifferenceData")
    @Expose
    private DifferenceDataDetail DifferenceData;

    /**
    * 数据行不一致的详情，mongodb业务用到
    */
    @SerializedName("DifferenceRow")
    @Expose
    private DifferenceRowDetail DifferenceRow;

    /**
     * Get 数据不一致的表详情 
     * @return Difference 数据不一致的表详情
     */
    public DifferenceDetail getDifference() {
        return this.Difference;
    }

    /**
     * Set 数据不一致的表详情
     * @param Difference 数据不一致的表详情
     */
    public void setDifference(DifferenceDetail Difference) {
        this.Difference = Difference;
    }

    /**
     * Get 跳过校验的表详情 
     * @return Skipped 跳过校验的表详情
     */
    public SkippedDetail getSkipped() {
        return this.Skipped;
    }

    /**
     * Set 跳过校验的表详情
     * @param Skipped 跳过校验的表详情
     */
    public void setSkipped(SkippedDetail Skipped) {
        this.Skipped = Skipped;
    }

    /**
     * Get 数据库不一致的详情，mongodb业务用到 
     * @return DifferenceAdvancedObjects 数据库不一致的详情，mongodb业务用到
     */
    public DifferenceAdvancedObjectsDetail getDifferenceAdvancedObjects() {
        return this.DifferenceAdvancedObjects;
    }

    /**
     * Set 数据库不一致的详情，mongodb业务用到
     * @param DifferenceAdvancedObjects 数据库不一致的详情，mongodb业务用到
     */
    public void setDifferenceAdvancedObjects(DifferenceAdvancedObjectsDetail DifferenceAdvancedObjects) {
        this.DifferenceAdvancedObjects = DifferenceAdvancedObjects;
    }

    /**
     * Get 数据不一致的详情，mongodb业务用到 
     * @return DifferenceData 数据不一致的详情，mongodb业务用到
     */
    public DifferenceDataDetail getDifferenceData() {
        return this.DifferenceData;
    }

    /**
     * Set 数据不一致的详情，mongodb业务用到
     * @param DifferenceData 数据不一致的详情，mongodb业务用到
     */
    public void setDifferenceData(DifferenceDataDetail DifferenceData) {
        this.DifferenceData = DifferenceData;
    }

    /**
     * Get 数据行不一致的详情，mongodb业务用到 
     * @return DifferenceRow 数据行不一致的详情，mongodb业务用到
     */
    public DifferenceRowDetail getDifferenceRow() {
        return this.DifferenceRow;
    }

    /**
     * Set 数据行不一致的详情，mongodb业务用到
     * @param DifferenceRow 数据行不一致的详情，mongodb业务用到
     */
    public void setDifferenceRow(DifferenceRowDetail DifferenceRow) {
        this.DifferenceRow = DifferenceRow;
    }

    public CompareDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareDetailInfo(CompareDetailInfo source) {
        if (source.Difference != null) {
            this.Difference = new DifferenceDetail(source.Difference);
        }
        if (source.Skipped != null) {
            this.Skipped = new SkippedDetail(source.Skipped);
        }
        if (source.DifferenceAdvancedObjects != null) {
            this.DifferenceAdvancedObjects = new DifferenceAdvancedObjectsDetail(source.DifferenceAdvancedObjects);
        }
        if (source.DifferenceData != null) {
            this.DifferenceData = new DifferenceDataDetail(source.DifferenceData);
        }
        if (source.DifferenceRow != null) {
            this.DifferenceRow = new DifferenceRowDetail(source.DifferenceRow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Difference.", this.Difference);
        this.setParamObj(map, prefix + "Skipped.", this.Skipped);
        this.setParamObj(map, prefix + "DifferenceAdvancedObjects.", this.DifferenceAdvancedObjects);
        this.setParamObj(map, prefix + "DifferenceData.", this.DifferenceData);
        this.setParamObj(map, prefix + "DifferenceRow.", this.DifferenceRow);

    }
}

