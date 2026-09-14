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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelTermModifyItem extends AbstractModel {

    /**
    * <p>操作类型（不可为 0，取值：1=新增，2=修改，3=删除）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODIFY_ACTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>MODIFY_ACTION_CREATE</td><td>1</td><td>新增</td></tr><tr><td>MODIFY_ACTION_UPDATE</td><td>2</td><td>修改</td></tr><tr><td>MODIFY_ACTION_DELETE</td><td>3</td><td>删除</td></tr></tbody></table></p>
    */
    @SerializedName("ModifyAction")
    @Expose
    private Long ModifyAction;

    /**
    * <p>同义词列表（CREATE 与 UPDATE 时传完整同义词集合，覆盖式更新）</p>
    */
    @SerializedName("SynonymList")
    @Expose
    private String [] SynonymList;

    /**
    * <p>标准词（CREATE 与 UPDATE 必填，DELETE 可留空）</p>
    */
    @SerializedName("Term")
    @Expose
    private String Term;

    /**
    * <p>标准词 ID（UPDATE 与 DELETE 必填，CREATE 留空由后台生成）</p>
    */
    @SerializedName("TermId")
    @Expose
    private String TermId;

    /**
     * Get <p>操作类型（不可为 0，取值：1=新增，2=修改，3=删除）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODIFY_ACTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>MODIFY_ACTION_CREATE</td><td>1</td><td>新增</td></tr><tr><td>MODIFY_ACTION_UPDATE</td><td>2</td><td>修改</td></tr><tr><td>MODIFY_ACTION_DELETE</td><td>3</td><td>删除</td></tr></tbody></table></p> 
     * @return ModifyAction <p>操作类型（不可为 0，取值：1=新增，2=修改，3=删除）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODIFY_ACTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>MODIFY_ACTION_CREATE</td><td>1</td><td>新增</td></tr><tr><td>MODIFY_ACTION_UPDATE</td><td>2</td><td>修改</td></tr><tr><td>MODIFY_ACTION_DELETE</td><td>3</td><td>删除</td></tr></tbody></table></p>
     */
    public Long getModifyAction() {
        return this.ModifyAction;
    }

    /**
     * Set <p>操作类型（不可为 0，取值：1=新增，2=修改，3=删除）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODIFY_ACTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>MODIFY_ACTION_CREATE</td><td>1</td><td>新增</td></tr><tr><td>MODIFY_ACTION_UPDATE</td><td>2</td><td>修改</td></tr><tr><td>MODIFY_ACTION_DELETE</td><td>3</td><td>删除</td></tr></tbody></table></p>
     * @param ModifyAction <p>操作类型（不可为 0，取值：1=新增，2=修改，3=删除）<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>MODIFY_ACTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>MODIFY_ACTION_CREATE</td><td>1</td><td>新增</td></tr><tr><td>MODIFY_ACTION_UPDATE</td><td>2</td><td>修改</td></tr><tr><td>MODIFY_ACTION_DELETE</td><td>3</td><td>删除</td></tr></tbody></table></p>
     */
    public void setModifyAction(Long ModifyAction) {
        this.ModifyAction = ModifyAction;
    }

    /**
     * Get <p>同义词列表（CREATE 与 UPDATE 时传完整同义词集合，覆盖式更新）</p> 
     * @return SynonymList <p>同义词列表（CREATE 与 UPDATE 时传完整同义词集合，覆盖式更新）</p>
     */
    public String [] getSynonymList() {
        return this.SynonymList;
    }

    /**
     * Set <p>同义词列表（CREATE 与 UPDATE 时传完整同义词集合，覆盖式更新）</p>
     * @param SynonymList <p>同义词列表（CREATE 与 UPDATE 时传完整同义词集合，覆盖式更新）</p>
     */
    public void setSynonymList(String [] SynonymList) {
        this.SynonymList = SynonymList;
    }

    /**
     * Get <p>标准词（CREATE 与 UPDATE 必填，DELETE 可留空）</p> 
     * @return Term <p>标准词（CREATE 与 UPDATE 必填，DELETE 可留空）</p>
     */
    public String getTerm() {
        return this.Term;
    }

    /**
     * Set <p>标准词（CREATE 与 UPDATE 必填，DELETE 可留空）</p>
     * @param Term <p>标准词（CREATE 与 UPDATE 必填，DELETE 可留空）</p>
     */
    public void setTerm(String Term) {
        this.Term = Term;
    }

    /**
     * Get <p>标准词 ID（UPDATE 与 DELETE 必填，CREATE 留空由后台生成）</p> 
     * @return TermId <p>标准词 ID（UPDATE 与 DELETE 必填，CREATE 留空由后台生成）</p>
     */
    public String getTermId() {
        return this.TermId;
    }

    /**
     * Set <p>标准词 ID（UPDATE 与 DELETE 必填，CREATE 留空由后台生成）</p>
     * @param TermId <p>标准词 ID（UPDATE 与 DELETE 必填，CREATE 留空由后台生成）</p>
     */
    public void setTermId(String TermId) {
        this.TermId = TermId;
    }

    public LabelTermModifyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelTermModifyItem(LabelTermModifyItem source) {
        if (source.ModifyAction != null) {
            this.ModifyAction = new Long(source.ModifyAction);
        }
        if (source.SynonymList != null) {
            this.SynonymList = new String[source.SynonymList.length];
            for (int i = 0; i < source.SynonymList.length; i++) {
                this.SynonymList[i] = new String(source.SynonymList[i]);
            }
        }
        if (source.Term != null) {
            this.Term = new String(source.Term);
        }
        if (source.TermId != null) {
            this.TermId = new String(source.TermId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModifyAction", this.ModifyAction);
        this.setParamArraySimple(map, prefix + "SynonymList.", this.SynonymList);
        this.setParamSimple(map, prefix + "Term", this.Term);
        this.setParamSimple(map, prefix + "TermId", this.TermId);

    }
}

