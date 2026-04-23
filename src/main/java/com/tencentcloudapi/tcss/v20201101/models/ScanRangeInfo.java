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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanRangeInfo extends AbstractModel {

    /**
    * true:选择全部；
false:部分选择
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
    * SCAN_NORMAL:普通节点；
SCAN_SUPER:超级节点
SCAN_CONTAINER:容器
    */
    @SerializedName("RangeType")
    @Expose
    private String RangeType;

    /**
    * 选择的ID
    */
    @SerializedName("IDs")
    @Expose
    private String [] IDs;

    /**
     * Get true:选择全部；
false:部分选择 
     * @return IsAll true:选择全部；
false:部分选择
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set true:选择全部；
false:部分选择
     * @param IsAll true:选择全部；
false:部分选择
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get SCAN_NORMAL:普通节点；
SCAN_SUPER:超级节点
SCAN_CONTAINER:容器 
     * @return RangeType SCAN_NORMAL:普通节点；
SCAN_SUPER:超级节点
SCAN_CONTAINER:容器
     */
    public String getRangeType() {
        return this.RangeType;
    }

    /**
     * Set SCAN_NORMAL:普通节点；
SCAN_SUPER:超级节点
SCAN_CONTAINER:容器
     * @param RangeType SCAN_NORMAL:普通节点；
SCAN_SUPER:超级节点
SCAN_CONTAINER:容器
     */
    public void setRangeType(String RangeType) {
        this.RangeType = RangeType;
    }

    /**
     * Get 选择的ID 
     * @return IDs 选择的ID
     */
    public String [] getIDs() {
        return this.IDs;
    }

    /**
     * Set 选择的ID
     * @param IDs 选择的ID
     */
    public void setIDs(String [] IDs) {
        this.IDs = IDs;
    }

    public ScanRangeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanRangeInfo(ScanRangeInfo source) {
        if (source.IsAll != null) {
            this.IsAll = new Boolean(source.IsAll);
        }
        if (source.RangeType != null) {
            this.RangeType = new String(source.RangeType);
        }
        if (source.IDs != null) {
            this.IDs = new String[source.IDs.length];
            for (int i = 0; i < source.IDs.length; i++) {
                this.IDs[i] = new String(source.IDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);
        this.setParamSimple(map, prefix + "RangeType", this.RangeType);
        this.setParamArraySimple(map, prefix + "IDs.", this.IDs);

    }
}

