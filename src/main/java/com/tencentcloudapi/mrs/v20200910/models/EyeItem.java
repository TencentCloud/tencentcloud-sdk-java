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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EyeItem extends AbstractModel {

    /**
    * <p>左眼</p>
    */
    @SerializedName("Left")
    @Expose
    private EyeChildItem Left;

    /**
    * <p>右眼</p>
    */
    @SerializedName("Right")
    @Expose
    private EyeChildItem Right;

    /**
    * <p>瞳距</p>
    */
    @SerializedName("Pd")
    @Expose
    private BaseItem2 Pd;

    /**
    * <p>右眼平均后结果</p>
    */
    @SerializedName("RightFinal")
    @Expose
    private EyeFinalItem RightFinal;

    /**
    * <p>左眼平均后结果</p>
    */
    @SerializedName("LeftFinal")
    @Expose
    private EyeFinalItem LeftFinal;

    /**
     * Get <p>左眼</p> 
     * @return Left <p>左眼</p>
     */
    public EyeChildItem getLeft() {
        return this.Left;
    }

    /**
     * Set <p>左眼</p>
     * @param Left <p>左眼</p>
     */
    public void setLeft(EyeChildItem Left) {
        this.Left = Left;
    }

    /**
     * Get <p>右眼</p> 
     * @return Right <p>右眼</p>
     */
    public EyeChildItem getRight() {
        return this.Right;
    }

    /**
     * Set <p>右眼</p>
     * @param Right <p>右眼</p>
     */
    public void setRight(EyeChildItem Right) {
        this.Right = Right;
    }

    /**
     * Get <p>瞳距</p> 
     * @return Pd <p>瞳距</p>
     */
    public BaseItem2 getPd() {
        return this.Pd;
    }

    /**
     * Set <p>瞳距</p>
     * @param Pd <p>瞳距</p>
     */
    public void setPd(BaseItem2 Pd) {
        this.Pd = Pd;
    }

    /**
     * Get <p>右眼平均后结果</p> 
     * @return RightFinal <p>右眼平均后结果</p>
     */
    public EyeFinalItem getRightFinal() {
        return this.RightFinal;
    }

    /**
     * Set <p>右眼平均后结果</p>
     * @param RightFinal <p>右眼平均后结果</p>
     */
    public void setRightFinal(EyeFinalItem RightFinal) {
        this.RightFinal = RightFinal;
    }

    /**
     * Get <p>左眼平均后结果</p> 
     * @return LeftFinal <p>左眼平均后结果</p>
     */
    public EyeFinalItem getLeftFinal() {
        return this.LeftFinal;
    }

    /**
     * Set <p>左眼平均后结果</p>
     * @param LeftFinal <p>左眼平均后结果</p>
     */
    public void setLeftFinal(EyeFinalItem LeftFinal) {
        this.LeftFinal = LeftFinal;
    }

    public EyeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EyeItem(EyeItem source) {
        if (source.Left != null) {
            this.Left = new EyeChildItem(source.Left);
        }
        if (source.Right != null) {
            this.Right = new EyeChildItem(source.Right);
        }
        if (source.Pd != null) {
            this.Pd = new BaseItem2(source.Pd);
        }
        if (source.RightFinal != null) {
            this.RightFinal = new EyeFinalItem(source.RightFinal);
        }
        if (source.LeftFinal != null) {
            this.LeftFinal = new EyeFinalItem(source.LeftFinal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Left.", this.Left);
        this.setParamObj(map, prefix + "Right.", this.Right);
        this.setParamObj(map, prefix + "Pd.", this.Pd);
        this.setParamObj(map, prefix + "RightFinal.", this.RightFinal);
        this.setParamObj(map, prefix + "LeftFinal.", this.LeftFinal);

    }
}

