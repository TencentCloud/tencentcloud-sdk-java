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

public class EyeFinalItem extends AbstractModel {

    /**
    * <p>球镜</p>
    */
    @SerializedName("Sph")
    @Expose
    private BaseItem3 Sph;

    /**
    * <p>柱镜</p>
    */
    @SerializedName("Cyl")
    @Expose
    private BaseItem3 Cyl;

    /**
    * <p>轴位</p>
    */
    @SerializedName("Ax")
    @Expose
    private BaseItem3 Ax;

    /**
    * <p>等效球镜</p>
    */
    @SerializedName("Se")
    @Expose
    private BaseItem2 Se;

    /**
     * Get <p>球镜</p> 
     * @return Sph <p>球镜</p>
     */
    public BaseItem3 getSph() {
        return this.Sph;
    }

    /**
     * Set <p>球镜</p>
     * @param Sph <p>球镜</p>
     */
    public void setSph(BaseItem3 Sph) {
        this.Sph = Sph;
    }

    /**
     * Get <p>柱镜</p> 
     * @return Cyl <p>柱镜</p>
     */
    public BaseItem3 getCyl() {
        return this.Cyl;
    }

    /**
     * Set <p>柱镜</p>
     * @param Cyl <p>柱镜</p>
     */
    public void setCyl(BaseItem3 Cyl) {
        this.Cyl = Cyl;
    }

    /**
     * Get <p>轴位</p> 
     * @return Ax <p>轴位</p>
     */
    public BaseItem3 getAx() {
        return this.Ax;
    }

    /**
     * Set <p>轴位</p>
     * @param Ax <p>轴位</p>
     */
    public void setAx(BaseItem3 Ax) {
        this.Ax = Ax;
    }

    /**
     * Get <p>等效球镜</p> 
     * @return Se <p>等效球镜</p>
     */
    public BaseItem2 getSe() {
        return this.Se;
    }

    /**
     * Set <p>等效球镜</p>
     * @param Se <p>等效球镜</p>
     */
    public void setSe(BaseItem2 Se) {
        this.Se = Se;
    }

    public EyeFinalItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EyeFinalItem(EyeFinalItem source) {
        if (source.Sph != null) {
            this.Sph = new BaseItem3(source.Sph);
        }
        if (source.Cyl != null) {
            this.Cyl = new BaseItem3(source.Cyl);
        }
        if (source.Ax != null) {
            this.Ax = new BaseItem3(source.Ax);
        }
        if (source.Se != null) {
            this.Se = new BaseItem2(source.Se);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Sph.", this.Sph);
        this.setParamObj(map, prefix + "Cyl.", this.Cyl);
        this.setParamObj(map, prefix + "Ax.", this.Ax);
        this.setParamObj(map, prefix + "Se.", this.Se);

    }
}

