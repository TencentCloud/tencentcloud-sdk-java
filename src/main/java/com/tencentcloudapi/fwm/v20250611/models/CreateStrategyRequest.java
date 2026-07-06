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

public class CreateStrategyRequest extends AbstractModel {

    /**
    * 产品类型
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 下发账号
    */
    @SerializedName("ReceiveAccount")
    @Expose
    private String [] ReceiveAccount;

    /**
    * 前区规则组
    */
    @SerializedName("PreStrategy")
    @Expose
    private StrategyReq [] PreStrategy;

    /**
    * 后区规则组
    */
    @SerializedName("PostStrategy")
    @Expose
    private StrategyReq [] PostStrategy;

    /**
    * 下发账号组
    */
    @SerializedName("ReceiveGroup")
    @Expose
    private String [] ReceiveGroup;

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

    /**
     * Get 下发账号 
     * @return ReceiveAccount 下发账号
     */
    public String [] getReceiveAccount() {
        return this.ReceiveAccount;
    }

    /**
     * Set 下发账号
     * @param ReceiveAccount 下发账号
     */
    public void setReceiveAccount(String [] ReceiveAccount) {
        this.ReceiveAccount = ReceiveAccount;
    }

    /**
     * Get 前区规则组 
     * @return PreStrategy 前区规则组
     */
    public StrategyReq [] getPreStrategy() {
        return this.PreStrategy;
    }

    /**
     * Set 前区规则组
     * @param PreStrategy 前区规则组
     */
    public void setPreStrategy(StrategyReq [] PreStrategy) {
        this.PreStrategy = PreStrategy;
    }

    /**
     * Get 后区规则组 
     * @return PostStrategy 后区规则组
     */
    public StrategyReq [] getPostStrategy() {
        return this.PostStrategy;
    }

    /**
     * Set 后区规则组
     * @param PostStrategy 后区规则组
     */
    public void setPostStrategy(StrategyReq [] PostStrategy) {
        this.PostStrategy = PostStrategy;
    }

    /**
     * Get 下发账号组 
     * @return ReceiveGroup 下发账号组
     */
    public String [] getReceiveGroup() {
        return this.ReceiveGroup;
    }

    /**
     * Set 下发账号组
     * @param ReceiveGroup 下发账号组
     */
    public void setReceiveGroup(String [] ReceiveGroup) {
        this.ReceiveGroup = ReceiveGroup;
    }

    public CreateStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStrategyRequest(CreateStrategyRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ReceiveAccount != null) {
            this.ReceiveAccount = new String[source.ReceiveAccount.length];
            for (int i = 0; i < source.ReceiveAccount.length; i++) {
                this.ReceiveAccount[i] = new String(source.ReceiveAccount[i]);
            }
        }
        if (source.PreStrategy != null) {
            this.PreStrategy = new StrategyReq[source.PreStrategy.length];
            for (int i = 0; i < source.PreStrategy.length; i++) {
                this.PreStrategy[i] = new StrategyReq(source.PreStrategy[i]);
            }
        }
        if (source.PostStrategy != null) {
            this.PostStrategy = new StrategyReq[source.PostStrategy.length];
            for (int i = 0; i < source.PostStrategy.length; i++) {
                this.PostStrategy[i] = new StrategyReq(source.PostStrategy[i]);
            }
        }
        if (source.ReceiveGroup != null) {
            this.ReceiveGroup = new String[source.ReceiveGroup.length];
            for (int i = 0; i < source.ReceiveGroup.length; i++) {
                this.ReceiveGroup[i] = new String(source.ReceiveGroup[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "ReceiveAccount.", this.ReceiveAccount);
        this.setParamArrayObj(map, prefix + "PreStrategy.", this.PreStrategy);
        this.setParamArrayObj(map, prefix + "PostStrategy.", this.PostStrategy);
        this.setParamArraySimple(map, prefix + "ReceiveGroup.", this.ReceiveGroup);

    }
}

