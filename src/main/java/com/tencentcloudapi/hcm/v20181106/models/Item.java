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
package com.tencentcloudapi.hcm.v20181106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Item  extends AbstractModel{

    /**
    * 识别的算式是否正确
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * 识别的算式
    */
    @SerializedName("ItemString")
    @Expose
    private String ItemString;

    /**
    * 识别的算式在图片上的位置信息
    */
    @SerializedName("ItemCoord")
    @Expose
    private ItemCoord ItemCoord;

    /**
    * 推荐的答案
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
     * 获取识别的算式是否正确
     * @return Item 识别的算式是否正确
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * 设置识别的算式是否正确
     * @param Item 识别的算式是否正确
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * 获取识别的算式
     * @return ItemString 识别的算式
     */
    public String getItemString() {
        return this.ItemString;
    }

    /**
     * 设置识别的算式
     * @param ItemString 识别的算式
     */
    public void setItemString(String ItemString) {
        this.ItemString = ItemString;
    }

    /**
     * 获取识别的算式在图片上的位置信息
     * @return ItemCoord 识别的算式在图片上的位置信息
     */
    public ItemCoord getItemCoord() {
        return this.ItemCoord;
    }

    /**
     * 设置识别的算式在图片上的位置信息
     * @param ItemCoord 识别的算式在图片上的位置信息
     */
    public void setItemCoord(ItemCoord ItemCoord) {
        this.ItemCoord = ItemCoord;
    }

    /**
     * 获取推荐的答案
     * @return Answer 推荐的答案
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * 设置推荐的答案
     * @param Answer 推荐的答案
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Item", this.Item);
        this.setParamSimple(map, prefix + "ItemString", this.ItemString);
        this.setParamObj(map, prefix + "ItemCoord.", this.ItemCoord);
        this.setParamSimple(map, prefix + "Answer", this.Answer);

    }
}

