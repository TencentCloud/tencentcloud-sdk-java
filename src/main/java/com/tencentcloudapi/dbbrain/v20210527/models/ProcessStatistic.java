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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessStatistic extends AbstractModel{

    /**
    * 会话详情数组。
    */
    @SerializedName("Items")
    @Expose
    private SessionItem [] Items;

    /**
    * 总连接数。
    */
    @SerializedName("AllConnSum")
    @Expose
    private Long AllConnSum;

    /**
    * 总活跃连接数。
    */
    @SerializedName("ActiveConnSum")
    @Expose
    private Long ActiveConnSum;

    /**
     * Get 会话详情数组。 
     * @return Items 会话详情数组。
     */
    public SessionItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 会话详情数组。
     * @param Items 会话详情数组。
     */
    public void setItems(SessionItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get 总连接数。 
     * @return AllConnSum 总连接数。
     */
    public Long getAllConnSum() {
        return this.AllConnSum;
    }

    /**
     * Set 总连接数。
     * @param AllConnSum 总连接数。
     */
    public void setAllConnSum(Long AllConnSum) {
        this.AllConnSum = AllConnSum;
    }

    /**
     * Get 总活跃连接数。 
     * @return ActiveConnSum 总活跃连接数。
     */
    public Long getActiveConnSum() {
        return this.ActiveConnSum;
    }

    /**
     * Set 总活跃连接数。
     * @param ActiveConnSum 总活跃连接数。
     */
    public void setActiveConnSum(Long ActiveConnSum) {
        this.ActiveConnSum = ActiveConnSum;
    }

    public ProcessStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessStatistic(ProcessStatistic source) {
        if (source.Items != null) {
            this.Items = new SessionItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new SessionItem(source.Items[i]);
            }
        }
        if (source.AllConnSum != null) {
            this.AllConnSum = new Long(source.AllConnSum);
        }
        if (source.ActiveConnSum != null) {
            this.ActiveConnSum = new Long(source.ActiveConnSum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "AllConnSum", this.AllConnSum);
        this.setParamSimple(map, prefix + "ActiveConnSum", this.ActiveConnSum);

    }
}

