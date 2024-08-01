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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputImportNameListDataFront extends AbstractModel {

    /**
    * 名单ID
    */
    @SerializedName("NameListId")
    @Expose
    private Long NameListId;

    /**
    * 数据来源，固定传2（手工录入）
    */
    @SerializedName("DataSource")
    @Expose
    private Long DataSource;

    /**
    * 黑白名单数据内容
    */
    @SerializedName("DataContentInfo")
    @Expose
    private DataContentInfo [] DataContentInfo;

    /**
     * Get 名单ID 
     * @return NameListId 名单ID
     */
    public Long getNameListId() {
        return this.NameListId;
    }

    /**
     * Set 名单ID
     * @param NameListId 名单ID
     */
    public void setNameListId(Long NameListId) {
        this.NameListId = NameListId;
    }

    /**
     * Get 数据来源，固定传2（手工录入） 
     * @return DataSource 数据来源，固定传2（手工录入）
     */
    public Long getDataSource() {
        return this.DataSource;
    }

    /**
     * Set 数据来源，固定传2（手工录入）
     * @param DataSource 数据来源，固定传2（手工录入）
     */
    public void setDataSource(Long DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get 黑白名单数据内容 
     * @return DataContentInfo 黑白名单数据内容
     */
    public DataContentInfo [] getDataContentInfo() {
        return this.DataContentInfo;
    }

    /**
     * Set 黑白名单数据内容
     * @param DataContentInfo 黑白名单数据内容
     */
    public void setDataContentInfo(DataContentInfo [] DataContentInfo) {
        this.DataContentInfo = DataContentInfo;
    }

    public InputImportNameListDataFront() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputImportNameListDataFront(InputImportNameListDataFront source) {
        if (source.NameListId != null) {
            this.NameListId = new Long(source.NameListId);
        }
        if (source.DataSource != null) {
            this.DataSource = new Long(source.DataSource);
        }
        if (source.DataContentInfo != null) {
            this.DataContentInfo = new DataContentInfo[source.DataContentInfo.length];
            for (int i = 0; i < source.DataContentInfo.length; i++) {
                this.DataContentInfo[i] = new DataContentInfo(source.DataContentInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NameListId", this.NameListId);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamArrayObj(map, prefix + "DataContentInfo.", this.DataContentInfo);

    }
}

