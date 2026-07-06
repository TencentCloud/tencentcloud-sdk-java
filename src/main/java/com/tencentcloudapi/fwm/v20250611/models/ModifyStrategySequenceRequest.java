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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStrategySequenceRequest extends AbstractModel {

    /**
    * 优先级列表
    */
    @SerializedName("Sequences")
    @Expose
    private SequenceIndex [] Sequences;

    /**
    * 执行区域
    */
    @SerializedName("ExecArea")
    @Expose
    private String ExecArea;

    /**
    * 产品类型
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 优先级列表 
     * @return Sequences 优先级列表
     */
    public SequenceIndex [] getSequences() {
        return this.Sequences;
    }

    /**
     * Set 优先级列表
     * @param Sequences 优先级列表
     */
    public void setSequences(SequenceIndex [] Sequences) {
        this.Sequences = Sequences;
    }

    /**
     * Get 执行区域 
     * @return ExecArea 执行区域
     */
    public String getExecArea() {
        return this.ExecArea;
    }

    /**
     * Set 执行区域
     * @param ExecArea 执行区域
     */
    public void setExecArea(String ExecArea) {
        this.ExecArea = ExecArea;
    }

    /**
     * Get 产品类型 
     * @return Product 产品类型
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 产品类型
     * @param Product 产品类型
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public ModifyStrategySequenceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStrategySequenceRequest(ModifyStrategySequenceRequest source) {
        if (source.Sequences != null) {
            this.Sequences = new SequenceIndex[source.Sequences.length];
            for (int i = 0; i < source.Sequences.length; i++) {
                this.Sequences[i] = new SequenceIndex(source.Sequences[i]);
            }
        }
        if (source.ExecArea != null) {
            this.ExecArea = new String(source.ExecArea);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Sequences.", this.Sequences);
        this.setParamSimple(map, prefix + "ExecArea", this.ExecArea);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

