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
    * <p>数据不一致的表详情</p>
    */
    @SerializedName("Difference")
    @Expose
    private DifferenceDetail Difference;

    /**
    * <p>跳过校验的表详情</p>
    */
    @SerializedName("Skipped")
    @Expose
    private SkippedDetail Skipped;

    /**
    * <p>数据库不一致的详情，mongodb业务用到</p>
    */
    @SerializedName("DifferenceAdvancedObjects")
    @Expose
    private DifferenceAdvancedObjectsDetail DifferenceAdvancedObjects;

    /**
    * <p>数据不一致的详情，mongodb业务用到</p>
    */
    @SerializedName("DifferenceData")
    @Expose
    private DifferenceDataDetail DifferenceData;

    /**
    * <p>数据行不一致的详情，mongodb业务用到</p>
    */
    @SerializedName("DifferenceRow")
    @Expose
    private DifferenceRowDetail DifferenceRow;

    /**
    * <p>表结构不一致详情，pg用</p>
    */
    @SerializedName("DifferenceSchema")
    @Expose
    private DifferenceSchemaDetail DifferenceSchema;

    /**
    * <p>对象owner不一致详情，pg用</p>
    */
    @SerializedName("DifferenceOwner")
    @Expose
    private DifferenceOwnerDetail DifferenceOwner;

    /**
    * <p>全量阶段表的校验进度。该字段后续逐步取代Difference</p>
    */
    @SerializedName("FullProgress")
    @Expose
    private CompareTableInfo FullProgress;

    /**
    * <p>增量阶段表的校验进度</p>
    */
    @SerializedName("IncDifference")
    @Expose
    private CompareTableInfo IncDifference;

    /**
     * Get <p>数据不一致的表详情</p> 
     * @return Difference <p>数据不一致的表详情</p>
     */
    public DifferenceDetail getDifference() {
        return this.Difference;
    }

    /**
     * Set <p>数据不一致的表详情</p>
     * @param Difference <p>数据不一致的表详情</p>
     */
    public void setDifference(DifferenceDetail Difference) {
        this.Difference = Difference;
    }

    /**
     * Get <p>跳过校验的表详情</p> 
     * @return Skipped <p>跳过校验的表详情</p>
     */
    public SkippedDetail getSkipped() {
        return this.Skipped;
    }

    /**
     * Set <p>跳过校验的表详情</p>
     * @param Skipped <p>跳过校验的表详情</p>
     */
    public void setSkipped(SkippedDetail Skipped) {
        this.Skipped = Skipped;
    }

    /**
     * Get <p>数据库不一致的详情，mongodb业务用到</p> 
     * @return DifferenceAdvancedObjects <p>数据库不一致的详情，mongodb业务用到</p>
     */
    public DifferenceAdvancedObjectsDetail getDifferenceAdvancedObjects() {
        return this.DifferenceAdvancedObjects;
    }

    /**
     * Set <p>数据库不一致的详情，mongodb业务用到</p>
     * @param DifferenceAdvancedObjects <p>数据库不一致的详情，mongodb业务用到</p>
     */
    public void setDifferenceAdvancedObjects(DifferenceAdvancedObjectsDetail DifferenceAdvancedObjects) {
        this.DifferenceAdvancedObjects = DifferenceAdvancedObjects;
    }

    /**
     * Get <p>数据不一致的详情，mongodb业务用到</p> 
     * @return DifferenceData <p>数据不一致的详情，mongodb业务用到</p>
     */
    public DifferenceDataDetail getDifferenceData() {
        return this.DifferenceData;
    }

    /**
     * Set <p>数据不一致的详情，mongodb业务用到</p>
     * @param DifferenceData <p>数据不一致的详情，mongodb业务用到</p>
     */
    public void setDifferenceData(DifferenceDataDetail DifferenceData) {
        this.DifferenceData = DifferenceData;
    }

    /**
     * Get <p>数据行不一致的详情，mongodb业务用到</p> 
     * @return DifferenceRow <p>数据行不一致的详情，mongodb业务用到</p>
     */
    public DifferenceRowDetail getDifferenceRow() {
        return this.DifferenceRow;
    }

    /**
     * Set <p>数据行不一致的详情，mongodb业务用到</p>
     * @param DifferenceRow <p>数据行不一致的详情，mongodb业务用到</p>
     */
    public void setDifferenceRow(DifferenceRowDetail DifferenceRow) {
        this.DifferenceRow = DifferenceRow;
    }

    /**
     * Get <p>表结构不一致详情，pg用</p> 
     * @return DifferenceSchema <p>表结构不一致详情，pg用</p>
     */
    public DifferenceSchemaDetail getDifferenceSchema() {
        return this.DifferenceSchema;
    }

    /**
     * Set <p>表结构不一致详情，pg用</p>
     * @param DifferenceSchema <p>表结构不一致详情，pg用</p>
     */
    public void setDifferenceSchema(DifferenceSchemaDetail DifferenceSchema) {
        this.DifferenceSchema = DifferenceSchema;
    }

    /**
     * Get <p>对象owner不一致详情，pg用</p> 
     * @return DifferenceOwner <p>对象owner不一致详情，pg用</p>
     */
    public DifferenceOwnerDetail getDifferenceOwner() {
        return this.DifferenceOwner;
    }

    /**
     * Set <p>对象owner不一致详情，pg用</p>
     * @param DifferenceOwner <p>对象owner不一致详情，pg用</p>
     */
    public void setDifferenceOwner(DifferenceOwnerDetail DifferenceOwner) {
        this.DifferenceOwner = DifferenceOwner;
    }

    /**
     * Get <p>全量阶段表的校验进度。该字段后续逐步取代Difference</p> 
     * @return FullProgress <p>全量阶段表的校验进度。该字段后续逐步取代Difference</p>
     */
    public CompareTableInfo getFullProgress() {
        return this.FullProgress;
    }

    /**
     * Set <p>全量阶段表的校验进度。该字段后续逐步取代Difference</p>
     * @param FullProgress <p>全量阶段表的校验进度。该字段后续逐步取代Difference</p>
     */
    public void setFullProgress(CompareTableInfo FullProgress) {
        this.FullProgress = FullProgress;
    }

    /**
     * Get <p>增量阶段表的校验进度</p> 
     * @return IncDifference <p>增量阶段表的校验进度</p>
     */
    public CompareTableInfo getIncDifference() {
        return this.IncDifference;
    }

    /**
     * Set <p>增量阶段表的校验进度</p>
     * @param IncDifference <p>增量阶段表的校验进度</p>
     */
    public void setIncDifference(CompareTableInfo IncDifference) {
        this.IncDifference = IncDifference;
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
        if (source.DifferenceSchema != null) {
            this.DifferenceSchema = new DifferenceSchemaDetail(source.DifferenceSchema);
        }
        if (source.DifferenceOwner != null) {
            this.DifferenceOwner = new DifferenceOwnerDetail(source.DifferenceOwner);
        }
        if (source.FullProgress != null) {
            this.FullProgress = new CompareTableInfo(source.FullProgress);
        }
        if (source.IncDifference != null) {
            this.IncDifference = new CompareTableInfo(source.IncDifference);
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
        this.setParamObj(map, prefix + "DifferenceSchema.", this.DifferenceSchema);
        this.setParamObj(map, prefix + "DifferenceOwner.", this.DifferenceOwner);
        this.setParamObj(map, prefix + "FullProgress.", this.FullProgress);
        this.setParamObj(map, prefix + "IncDifference.", this.IncDifference);

    }
}

