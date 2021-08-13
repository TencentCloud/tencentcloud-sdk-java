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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NewModeItems extends AbstractModel{

    /**
    * 新增模式下接入的vpc列表
    */
    @SerializedName("VpcList")
    @Expose
    private String [] VpcList;

    /**
    * 新增模式下绑定的出口弹性公网ip列表，其中Eips和AddCount至少传递一个。
    */
    @SerializedName("Eips")
    @Expose
    private String [] Eips;

    /**
    * 新增模式下新增绑定的出口弹性公网ip个数，其中Eips和AddCount至少传递一个。
    */
    @SerializedName("AddCount")
    @Expose
    private Long AddCount;

    /**
     * Get 新增模式下接入的vpc列表 
     * @return VpcList 新增模式下接入的vpc列表
     */
    public String [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set 新增模式下接入的vpc列表
     * @param VpcList 新增模式下接入的vpc列表
     */
    public void setVpcList(String [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get 新增模式下绑定的出口弹性公网ip列表，其中Eips和AddCount至少传递一个。 
     * @return Eips 新增模式下绑定的出口弹性公网ip列表，其中Eips和AddCount至少传递一个。
     */
    public String [] getEips() {
        return this.Eips;
    }

    /**
     * Set 新增模式下绑定的出口弹性公网ip列表，其中Eips和AddCount至少传递一个。
     * @param Eips 新增模式下绑定的出口弹性公网ip列表，其中Eips和AddCount至少传递一个。
     */
    public void setEips(String [] Eips) {
        this.Eips = Eips;
    }

    /**
     * Get 新增模式下新增绑定的出口弹性公网ip个数，其中Eips和AddCount至少传递一个。 
     * @return AddCount 新增模式下新增绑定的出口弹性公网ip个数，其中Eips和AddCount至少传递一个。
     */
    public Long getAddCount() {
        return this.AddCount;
    }

    /**
     * Set 新增模式下新增绑定的出口弹性公网ip个数，其中Eips和AddCount至少传递一个。
     * @param AddCount 新增模式下新增绑定的出口弹性公网ip个数，其中Eips和AddCount至少传递一个。
     */
    public void setAddCount(Long AddCount) {
        this.AddCount = AddCount;
    }

    public NewModeItems() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NewModeItems(NewModeItems source) {
        if (source.VpcList != null) {
            this.VpcList = new String[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new String(source.VpcList[i]);
            }
        }
        if (source.Eips != null) {
            this.Eips = new String[source.Eips.length];
            for (int i = 0; i < source.Eips.length; i++) {
                this.Eips[i] = new String(source.Eips[i]);
            }
        }
        if (source.AddCount != null) {
            this.AddCount = new Long(source.AddCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VpcList.", this.VpcList);
        this.setParamArraySimple(map, prefix + "Eips.", this.Eips);
        this.setParamSimple(map, prefix + "AddCount", this.AddCount);

    }
}

