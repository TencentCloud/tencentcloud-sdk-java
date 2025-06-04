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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewRow extends AbstractModel {

    /**
    * 表名字
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 读请求次数
    */
    @SerializedName("ReadRequestCount")
    @Expose
    private Float ReadRequestCount;

    /**
    * 写请求次数
    */
    @SerializedName("WriteRequestCount")
    @Expose
    private Float WriteRequestCount;

    /**
    * 当前memstore的size
    */
    @SerializedName("MemstoreSize")
    @Expose
    private Float MemstoreSize;

    /**
    * 当前region中StroreFile的size
    */
    @SerializedName("StoreFileSize")
    @Expose
    private Float StoreFileSize;

    /**
    * regions，点击可跳转
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * StoreFile数量
    */
    @SerializedName("StoreFileNum")
    @Expose
    private Float StoreFileNum;

    /**
     * Get 表名字 
     * @return Table 表名字
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 表名字
     * @param Table 表名字
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 读请求次数 
     * @return ReadRequestCount 读请求次数
     */
    public Float getReadRequestCount() {
        return this.ReadRequestCount;
    }

    /**
     * Set 读请求次数
     * @param ReadRequestCount 读请求次数
     */
    public void setReadRequestCount(Float ReadRequestCount) {
        this.ReadRequestCount = ReadRequestCount;
    }

    /**
     * Get 写请求次数 
     * @return WriteRequestCount 写请求次数
     */
    public Float getWriteRequestCount() {
        return this.WriteRequestCount;
    }

    /**
     * Set 写请求次数
     * @param WriteRequestCount 写请求次数
     */
    public void setWriteRequestCount(Float WriteRequestCount) {
        this.WriteRequestCount = WriteRequestCount;
    }

    /**
     * Get 当前memstore的size 
     * @return MemstoreSize 当前memstore的size
     */
    public Float getMemstoreSize() {
        return this.MemstoreSize;
    }

    /**
     * Set 当前memstore的size
     * @param MemstoreSize 当前memstore的size
     */
    public void setMemstoreSize(Float MemstoreSize) {
        this.MemstoreSize = MemstoreSize;
    }

    /**
     * Get 当前region中StroreFile的size 
     * @return StoreFileSize 当前region中StroreFile的size
     */
    public Float getStoreFileSize() {
        return this.StoreFileSize;
    }

    /**
     * Set 当前region中StroreFile的size
     * @param StoreFileSize 当前region中StroreFile的size
     */
    public void setStoreFileSize(Float StoreFileSize) {
        this.StoreFileSize = StoreFileSize;
    }

    /**
     * Get regions，点击可跳转 
     * @return Operation regions，点击可跳转
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set regions，点击可跳转
     * @param Operation regions，点击可跳转
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get StoreFile数量 
     * @return StoreFileNum StoreFile数量
     */
    public Float getStoreFileNum() {
        return this.StoreFileNum;
    }

    /**
     * Set StoreFile数量
     * @param StoreFileNum StoreFile数量
     */
    public void setStoreFileNum(Float StoreFileNum) {
        this.StoreFileNum = StoreFileNum;
    }

    public OverviewRow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewRow(OverviewRow source) {
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.ReadRequestCount != null) {
            this.ReadRequestCount = new Float(source.ReadRequestCount);
        }
        if (source.WriteRequestCount != null) {
            this.WriteRequestCount = new Float(source.WriteRequestCount);
        }
        if (source.MemstoreSize != null) {
            this.MemstoreSize = new Float(source.MemstoreSize);
        }
        if (source.StoreFileSize != null) {
            this.StoreFileSize = new Float(source.StoreFileSize);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.StoreFileNum != null) {
            this.StoreFileNum = new Float(source.StoreFileNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "ReadRequestCount", this.ReadRequestCount);
        this.setParamSimple(map, prefix + "WriteRequestCount", this.WriteRequestCount);
        this.setParamSimple(map, prefix + "MemstoreSize", this.MemstoreSize);
        this.setParamSimple(map, prefix + "StoreFileSize", this.StoreFileSize);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "StoreFileNum", this.StoreFileNum);

    }
}

