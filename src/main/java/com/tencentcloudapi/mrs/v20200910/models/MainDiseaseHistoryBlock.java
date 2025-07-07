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

public class MainDiseaseHistoryBlock extends AbstractModel {

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 原文
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 状态
    */
    @SerializedName("State")
    @Expose
    private Boolean State;

    /**
    * 对外输出值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 否定列表
    */
    @SerializedName("Neglist")
    @Expose
    private NeglistBlock Neglist;

    /**
    * 肯定列表
    */
    @SerializedName("Poslist")
    @Expose
    private PoslistBlock Poslist;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 原文 
     * @return Src 原文
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 原文
     * @param Src 原文
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 状态 
     * @return State 状态
     */
    public Boolean getState() {
        return this.State;
    }

    /**
     * Set 状态
     * @param State 状态
     */
    public void setState(Boolean State) {
        this.State = State;
    }

    /**
     * Get 对外输出值 
     * @return Value 对外输出值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 对外输出值
     * @param Value 对外输出值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 否定列表 
     * @return Neglist 否定列表
     */
    public NeglistBlock getNeglist() {
        return this.Neglist;
    }

    /**
     * Set 否定列表
     * @param Neglist 否定列表
     */
    public void setNeglist(NeglistBlock Neglist) {
        this.Neglist = Neglist;
    }

    /**
     * Get 肯定列表 
     * @return Poslist 肯定列表
     */
    public PoslistBlock getPoslist() {
        return this.Poslist;
    }

    /**
     * Set 肯定列表
     * @param Poslist 肯定列表
     */
    public void setPoslist(PoslistBlock Poslist) {
        this.Poslist = Poslist;
    }

    public MainDiseaseHistoryBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MainDiseaseHistoryBlock(MainDiseaseHistoryBlock source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.State != null) {
            this.State = new Boolean(source.State);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Neglist != null) {
            this.Neglist = new NeglistBlock(source.Neglist);
        }
        if (source.Poslist != null) {
            this.Poslist = new PoslistBlock(source.Poslist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamObj(map, prefix + "Neglist.", this.Neglist);
        this.setParamObj(map, prefix + "Poslist.", this.Poslist);

    }
}

