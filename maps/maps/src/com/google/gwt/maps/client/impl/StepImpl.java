/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.geocode.Distance;
import com.google.gwt.maps.client.geocode.Duration;
import com.google.gwt.maps.client.geom.LatLng;
import com.google.gwt.maps.jsio.client.JSFlyweightWrapper;

/**
 * Wrapper for the GStep object form the Maps API using JSIO. Objects of this
 * class are created by the GDirections object to store information about a
 * single step within a route in a directions result. This class does not have a
 * public constructor.
 */
public interface StepImpl extends JSFlyweightWrapper {

  StepImpl impl = GWT.create(StepImpl.class);

  String getDescriptionHtml(JavaScriptObject jsoPeer);

  Distance getDistance(JavaScriptObject jsoPeer);

  Duration getDuration(JavaScriptObject jsoPeer);

  LatLng getLatLng(JavaScriptObject jsoPeer);

  int getPolylineIndex(JavaScriptObject jsoPeer);

}
