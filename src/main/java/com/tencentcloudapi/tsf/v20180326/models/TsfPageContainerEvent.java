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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TsfPageContainerEvent extends AbstractModel{

    /**
    * 返回个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * events 数组
    */
    @SerializedName("Content")
    @Expose
    private ContainerEvent [] Content;

    /**
     * Get 返回个数 
     * @return TotalCount 返回个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 返回个数
     * @param TotalCount 返回个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get events 数组 
     * @return Content events 数组
     */
    public ContainerEvent [] getContent() {
        return this.Content;
    }

    /**
     * Set events 数组
     * @param Content events 数组
     */
    public void setContent(ContainerEvent [] Content) {
        this.Content = Content;
    }

    public TsfPageContainerEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TsfPageContainerEvent(TsfPageContainerEvent source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Content != null) {
            this.Content = new ContainerEvent[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new ContainerEvent(source.Content[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);

    }
}

